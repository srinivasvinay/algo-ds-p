package com.algo.intro.chapter1;

/* 
    This is a very simple implementaion of stak using resiable Arrays Arrays */
public class TestImplementationsAlgo {

    public static void main(final String[] args) {
        //testStackImplementation();
        testQuickFind();
    }

    static void testStackImplementation(){
        final SimpleStackImplementation st = new SimpleStackImplementation();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        while (st.getSizse() > 0) {
            System.out.println(st.pop());
        }
    }
    static void testQuickFind(){
        QuickFind qf = new QuickFind(5);
        qf.union(1, 2);
        qf.union(2, 3);
        qf.union(3, 4);
        System.out.println("Is Connected? "+qf.isConnected(0, 4));
    }
}