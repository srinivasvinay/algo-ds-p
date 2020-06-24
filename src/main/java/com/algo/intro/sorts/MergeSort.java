package com.algo.intro.sorts;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        Integer[] toBeSortedNumbers = { 657, 476, 76, 55, 47, 7, 5, 344, 444, 63, 643, 5, 555, 23, 1 };
        Integer[] auxArray = new Integer[toBeSortedNumbers.length];
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeTopDown(toBeSortedNumbers, 0, toBeSortedNumbers.length, auxArray);
        System.out.println(Arrays.toString(toBeSortedNumbers));
    }

    private void mergeTopDown(Comparable[] numbers, int lo, int hi, Comparable[] aux) {
        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;

        mergeTopDown(numbers, lo, mid, aux);
        mergeTopDown(numbers, mid + 1, hi, aux);
        merge(lo, mid, hi, numbers, aux);

    }

    private void merge(int lo, int mid, int hi, Comparable[] numbers, Comparable[] aux) {
        int k = 0;
        for (Comparable num : numbers) {
            aux[k++]=num;
        }

         
        int j = mid + 1;
        int i = lo;
        
        for (int f = lo; f <hi; f++) {
            if (i > mid) {
                numbers[f] = aux[j++];
            } else if (j >= hi) {
                numbers[f] = aux[i++];
            } else if (aux[i].compareTo(aux[j]) > 0)
                numbers[f] = aux[j++];
            else {
                numbers[f] = aux[i++];
            }

        }
    }

}