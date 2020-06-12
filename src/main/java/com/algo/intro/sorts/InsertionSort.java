package com.algo.intro.sorts;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        Integer arrayOfInts[] = { 6, 3, 5, 2, 1, 7, 4, 3, 8, 0 };
        insertionSort(arrayOfInts);
    }

    private static void insertionSort(Comparable[] numbers) {
        int j = 0;
        for (int i = 1; i < numbers.length; i++) {

            for (int k = j + 1; k > 0; k--) {
                if (numbers[k].compareTo(numbers[k - 1]) < 0) {
                    SortUtil.swapComparables(k, k - 1, numbers);
                } else {
                    break;
                }
            }
            j++;

        }

        System.out.println(Arrays.toString(numbers));

    }

}