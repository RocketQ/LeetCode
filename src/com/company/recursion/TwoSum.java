package com.company.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int lenghtOfArray = s.nextInt();
        int[] mas = new int[lenghtOfArray];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = s.nextInt();
        }
        int found = s.nextInt();
        foundSum(found, mas);
    }

    static void foundSum(int x, int[] mas) {
        int[] indexes = new int[2];
        boolean r = false;
            for (int i = 0; i < mas.length; i++) {
                for (int j = i+1; j < mas.length; j++) {
                    if (mas[i] + mas[j] == x) {
                        indexes[0] = mas[i];
                        indexes[1] = mas[j];
                        r = true;
                    }
                }
            }
        System.out.println((r) ? indexes[1] + " " + indexes[0] : "None");
    }
}


