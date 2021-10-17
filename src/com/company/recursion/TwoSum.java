package com.company.recursion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int lenghtOfArray = s.nextInt();
        int[] mas = new int[lenghtOfArray];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = s.nextInt();
        }
        int found = s.nextInt();
        foundSumTwo(mas,found);
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

    /**
     * Функция для нахождения K
     * @param mas входной массив
     * @param K число, которое нужно найти в массиве(m[i]+m[k]) = K
     */
    static void foundSumTwo(int[] mas, int K){
        boolean found = false;
        int lt = 0;
        int rt = mas.length-1;

        while (lt != rt) {
            int cursum = mas[lt] + mas[rt];
            if(cursum<K) {
                lt++;
            }
            else if(cursum>K){
                rt--;
            }
            else {
                System.out.println(mas[lt] +" " + mas[rt]);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("None");
        }
    }

    static void arrayTwoSum(int x, int[] mas) {

    }

}


