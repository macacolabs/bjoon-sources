package com.macacolabs.ctest.recursion.ex2;
// https://www.acmicpc.net/problem/10870

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        System.out.println(fibonacci(N));
    }

    public static int fibonacci(int n) {

        if(n <= 1) return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
