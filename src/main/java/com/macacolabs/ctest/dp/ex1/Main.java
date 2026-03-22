package com.macacolabs.ctest.dp.ex1;

// https://www.acmicpc.net/problem/24416

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int countRecursive = 0;
    static int countDp = 0;
    static int[] f;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        f = new int[N + 1];

        fib(N);
        fibonacci(N);

        System.out.println(countRecursive +  " " + countDp);
    }

    public static int fib(int n) {

        if(n == 1 || n == 2) {
            countRecursive++;
            return 1;
        }
        else  return fib(n-1) + fib(n-2);
    }

    public static int fibonacci(int n) {
        f[1] = 1;
        f[2] = 1;
        for (int i = 3; i <= n; i++) {
            countDp++;
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }


}
