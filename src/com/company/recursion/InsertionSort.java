package com.company.recursion;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] mas = {2,-1,0,3,-3};

        // Сортировка вставкой
        for (int i = 1; i < mas.length; i++) {
            int current = mas[i];
            int j = i;
            while (j>0 && mas[j-1] >current){
                mas[j]  = mas[j-1];
                j--;
            }
            mas[j] = current;
        }

        System.out.println(Arrays.toString(mas));
    }
}
