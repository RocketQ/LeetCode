package com.company.yandex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ValueOfY {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String row = reader.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(row, " ");
        int a = 0, x = 0, b = 0, c = 0;
        while (stringTokenizer.hasMoreTokens()) {
            a = Integer.parseInt(stringTokenizer.nextToken());
            x = Integer.parseInt(stringTokenizer.nextToken());
            b = Integer.parseInt(stringTokenizer.nextToken());
            c = Integer.parseInt(stringTokenizer.nextToken());
        }
        System.out.println(valueOfY(a, x, b, c));
    }

    public static int valueOfY(int a, int x, int b, int c) {
        return (a * (x * x) + b * x + c);
    }
}
