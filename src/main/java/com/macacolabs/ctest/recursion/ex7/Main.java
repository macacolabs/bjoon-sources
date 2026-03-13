package com.macacolabs.ctest.recursion.ex7;

// https://www.acmicpc.net/problem/11729

import java.io.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        sb.append((1 << N) - 1).append("\n");

        hanoi(N, 1, 2, 3);
        System.out.println(sb);
    }

    public static void hanoi(int n, int start, int mid, int to) {

        if(n == 1) {
            sb.append(start).append(" ").append(to).append("\n");
            return;
        }

        hanoi(n-1, start, to, mid);

        sb.append(start).append(" ").append(to).append("\n");

        hanoi(n - 1, mid, start, to);
    }
}
