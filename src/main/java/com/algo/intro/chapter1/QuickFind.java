package com.algo.intro.chapter1;

public class QuickFind {
    private int[] d;

    public QuickFind(int N) {
        d = new int[N];
        for (int i = 0; i < N; i++) {
            d[i] = i;
        }
    }

    public boolean isConnected(int source, int destination) {
        return d[source] == d[destination];
    }

    public void union(int source, int destination) {
        int idOfSource = d[source];
        int idOfDestination = d[destination];
        for (int i = 0; i < d.length; i++) {
            if (d[i] == idOfSource)
                d[i] = idOfDestination;
        }

    }
}