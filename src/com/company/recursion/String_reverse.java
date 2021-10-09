package com.company.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class String_reverse {
    public static void main(String[] args) throws IOException {
        try(BufferedReader at = new BufferedReader(new InputStreamReader(System.in))) {
            String_reverse a = new String_reverse();
            int n = Integer.parseInt(at.readLine());
            float[] mas = new float[n];
            String[] d = at.readLine().trim().split(" ");
            for (int i = 0; i < mas.length; i++) {
                mas[i] = Float.parseFloat(d[i]);
            }
            int K = Integer.parseInt(at.readLine());
            a.movingAverage(n,mas,K);
        }
    }

    public static char[] reverseString(char[] s) {
        char[] res = new char[s.length];
        for (int i = s.length - 1, j = 0; i >= 0; i--, j++) {
            res[j] = s[i];
        }
        System.out.println(Arrays.toString(res));
        new StringBuilder(Arrays.toString(s)).reverse();
        return res;
    }

    public void reverseString2(char[] s) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mas1 = new int[n];
        int[] mas2 = new int[n];
        int[] resultMas = new int[2 * n];
        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = scanner.nextInt();
        }
        for (int i = 0; i < mas2.length; i++) {
            mas2[i] = scanner.nextInt();
        }
        int counterMas1 = 0;
        int counterMas2 = 0;
        while (counterMas1 < mas1.length) {
            for (int i = 0; i < resultMas.length; i++) {
                if (i % 2 == 0) {
                    resultMas[i] = mas1[counterMas1];
                    counterMas1++;
                }
            }
        }
        while (counterMas2 < mas2.length) {
            for (int i = 0; i < resultMas.length; i++) {
                if (i % 2 != 0) {
                    resultMas[i] = mas2[counterMas2];
                    counterMas2++;
                }
            }
        }

        for (int resutmas : resultMas) {
            System.out.print(resutmas + " ");
        }
    }

     void movingAverage(int n, float[] mas,int K) {
        float counter = 0;
        float avg;
        for (int i = 0; i < K; i++) {
            counter = counter + mas[i];
        }
         System.out.print(counter/K+" ");
        for (int i = 0; i < (n-K); i++) {
            counter = counter - mas[i];
            counter = counter + mas[i+K];
            avg = counter/K;
            System.out.print(avg+" ");
        }
    }
}
