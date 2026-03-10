package com.macacolabs.ctest.combinatorics.ex4;
// https://www.acmicpc.net/problem/11050

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        System.out.println(factorial(N) / (factorial(K) * factorial(N - K)));
    }

    public static long factorial(int n){
        if(n <= 1) return 1;
        return n * factorial(n - 1);
    }
}
