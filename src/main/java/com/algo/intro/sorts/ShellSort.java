package com.algo.intro.sorts;

import java.util.Arrays;

public class ShellSort {
    public static void main(final String[] args) {
        final ShellSort shellSort = new ShellSort();
        Integer[] numbers = { 1, 3, 6, 2, 3, 66, 66666, 3, 44, 22, 44, 11, 12, 65, 34, 57, 34 };
        shellSort.shellSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private void shellSort(Comparable[] numbers) {
        int h = computeH(numbers.length);
        while (h >= 1) {

            for (int i = h; i < numbers.length; i++) {
                for (int j = i; j >= h; j -= h) {
                    if ((numbers[j].compareTo(numbers[j-h])<0)) {
                        SortUtil.swapComparables(j, (j-h), numbers);
                    } else
                        break;
                }
            }
            h /= 3;
        }

    }

    private int computeH(final int lengthOfArray) {
        return lengthOfArray / 3;
    }
}