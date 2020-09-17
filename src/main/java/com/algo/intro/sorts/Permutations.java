/*
MIT License
© Srinivas Vinay
*/
package com.algo.intro.sorts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//List all permutations of a string using a recursion method and a interation method
public class Permutations {

    private static String swapCharsInString(String s, int i, int j) {

        char[] c = s.toCharArray();
        char tmp = c[i];
        c[i] = c[j];
        c[j] = tmp;

        return new String(c);
    }

    private void permutationsUsingRecursion(String s, int start, List<String> permList) {

        int end = s.length();

        if (end < 1) {
            return;
        }
        if (start == end) {
            permList.add(s);
            return;
        }

        permutationsUsingRecursion(s, start + 1, permList);

        for (int i = start + 1; i < end; i++) {
            if (s.charAt(start) == s.charAt(i))
                continue;
            s = swapCharsInString(s, start, i);
            permutationsUsingRecursion(s, start + 1, permList);
        }

    }

    public List<String> listAllPermutationsForString(String s) {
        List<String> permList = new ArrayList<String>();
        this.permutationsUsingRecursion(s, 0, permList);
        return permList;
    }

    public List<String> listAllPermutationsForString2(String s) {
        List<String> permList = new ArrayList<String>();
        this.permutationUsingIterations(s, 0, permList);
        return permList;
    }
    static int iterationLength=0;
    private void permutationUsingIterations(String s, int start, List<String> permList) {
        
        int end = s.length();
        if (end < 1) {
            return;
        }
        if (start == 0) {
            permList.add(s);
        }
        for (int i = end - 2; i >= start; i--) {
            List<String> subPermutations = new ArrayList<String>();
            for (String st : permList) {
                if(st.charAt(i)== st.charAt(i+1))
                continue;
                String st2 = st;
                for (int k = i; k < end - 1; k++) {
                    if (st2.charAt(k) == st2.charAt(k + 1))
                        break;
                    st2 = swapCharsInString(st2, k, k + 1);
                    subPermutations.add(st2);
                    ++iterationLength;
                }
            }
            if (subPermutations.size()>0)
            permList.addAll(subPermutations);
        }

    }

    public static void main(String[] args) {
        final Permutations cls = new Permutations();
        final List<String> permList = cls.listAllPermutationsForString2("abcd");
        HashSet<String> testList = new HashSet<>();
        permList.forEach(str -> testList.add(str));
        System.out.println(Arrays.asList(permList) + "  " + permList.size() + " testList size " + testList.size() +" iter len "+ iterationLength);
    }
}
