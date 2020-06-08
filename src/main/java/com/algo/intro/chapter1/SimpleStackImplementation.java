package com.algo.intro.chapter1;

public class SimpleStackImplementation {
    private final int arraySize = 2;
        private int[] dataInStack;
        private int N = 0;

        public int getSizse() {
            return N;
        }

        public int pop() {
            if (dataInStack.length < 1) {
                return 0;
            }
            return dataInStack[--N];
        }

        public void push(final int dataToPushToStack) {
            if (dataInStack != null) {
                if (N == dataInStack.length) {
                    final int[] newdataInStack = new int[dataInStack.length + arraySize];
                    System.arraycopy(dataInStack, 0, newdataInStack, 0, dataInStack.length);
                    dataInStack = newdataInStack;

                }
                dataInStack[N++] = dataToPushToStack;
            } else {
                dataInStack = new int[arraySize];
                dataInStack[N++] = dataToPushToStack;
            }

            return;
        }
    }