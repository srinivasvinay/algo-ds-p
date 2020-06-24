package com.algo.intro.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RecursiveDigitSum {
//https://www.hackerrank.com/challenges/recursive-digit-sum/problem
    // Complete the superDigit function below.
    static int superDigit(String n, int k) {
        int sum = 0;
        if (n.length() <2){
            return Integer.parseInt(n);
        }

        String[] ab = n.split("");
        for (String ar : ab) {
            System.out.println("adf" +ar);
            sum += Integer.parseInt(ar);

            if (sum > 10000000) {
                sum = superDigit(String.valueOf(sum), 1);
            }
        }
       /*  if (sum > 9) {
            sum = superDigit(String.valueOf(sum), 1);
        } */
        sum *= k;
        if (sum > 9)
            sum = superDigit(String.valueOf(sum), 1);
        return sum;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        String n = nk[0];

        int k = Integer.parseInt(nk[1]);

        int result = superDigit(n, k);
        System.out.println(result);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
