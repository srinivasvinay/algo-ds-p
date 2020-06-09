package com.algo.intro.sorts;

public class SortUtil {
    
    public static void swapnumbers(int i, int j, int[] numbers) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
    public static boolean compare(int i, int j){
        return i<j;
    }
}