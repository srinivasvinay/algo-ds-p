package com.algo.intro.sorts;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        SelectionSort sort = new SelectionSort();
        int[] numbers = { 1, 1, 3, 5, 9, 2, 32, 5, 4, 655, 21, 2, 5, 441, 1 };
        sort.selectionSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    void selectionSort(int[] numbers) {
        int min = 0;
        for (int i = 0; i < numbers.length; i++) {
            min = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j])
                    min = j;

            }
            SortUtil.swapnumbers(i, min, numbers);
        }
    }
}