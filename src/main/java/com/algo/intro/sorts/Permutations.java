package com.algo.intro.sorts;

import java.util.ArrayList;
import java.util.List;
//List all permutations of a string
public class Permutations {

    private static String swap(String s, int i, int j) {

        char[] c = s.toCharArray();
        char tmp = c[i];
        c[i] = c[j];
        c[j] = tmp;

        return new String(c);
    }

    private void permute(String s, int start, List<String> permList) {

        int end = s.length();

        if (end < 1) {
            return;
        }
        if (start == end) {
            permList.add(s);
            return;
        }

        permute(s, start + 1, permList);

        for (int i = start + 1; i < end; i++) {
            if (s.charAt(start) == s.charAt(i))
                continue;
            s = swap(s, start, i);
            permute(s, start + 1, permList);
        }

    }

    public List<String> listAllPermutationsForString(String s) {
        List<String> permList = new ArrayList<String>();
        this.permute(s, 0, permList);
        return permList;
    }

}
