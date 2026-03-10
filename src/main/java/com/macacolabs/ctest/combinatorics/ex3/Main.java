package com.macacolabs.ctest.combinatorics.ex3;
// https://www.acmicpc.net/problem/10872

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println(factorial(N));
    }

    public static long factorial(int n) {
        if(n <= 1) return 1;

        return n * factorial(n - 1);
    }
}
