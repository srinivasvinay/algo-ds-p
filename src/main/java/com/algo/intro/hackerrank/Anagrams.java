package com.algo.intro.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/making-anagrams/problem
public class Anagrams {

    // Complete the makingAnagrams function below.
    static int makingAnagrams(String s1, String s2) {
            int []charcounts1= new int[26];
            char[] charArrayS1=s1.toCharArray();
            char[] charArrayS2=s2.toCharArray();
            for (char ch: charArrayS1){
                charcounts1[ch-'a']+=1;
            }
            for (char ch: charArrayS2){
                charcounts1[ch-'a']=Math.abs(charcounts1[ch-'a']-1);
            }
            int anagramsCount=0;
            for (int i: charcounts1){
                anagramsCount+=i;
            }
            return anagramsCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = scanner.nextLine();

        String s2 = scanner.nextLine();

        int result = makingAnagrams(s1, s2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
        System.out.println(result);
        scanner.close();
    }
}
