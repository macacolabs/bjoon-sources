package com.macacolabs.ctest.mathmatic.ex13;
// https://www.acmicpc.net/problem/11653

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        if(N == 1) return;

        StringBuilder sb = new StringBuilder();

        for(int i = 2; i <= N; i++) {
            while(N % i == 0) {
                sb.append(i).append("\n");
                N /= i;
            }
        }
        System.out.println(sb);
    }
}
