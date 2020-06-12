package com.algo.intro.sorts;

public class SortUtil {

    public static void swapComparables(int i, int j, Comparable<?>[] comparables) {
        Comparable<?> temp = comparables[i];
        comparables[i] = comparables[j];
        comparables[j] = temp;
    }
}