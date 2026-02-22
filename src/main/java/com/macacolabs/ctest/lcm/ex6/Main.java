package com.macacolabs.ctest.lcm.ex6;
// https://www.acmicpc.net/problem/1929

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        for(int i = M; i <= N; i++) {
            if(isPrime(i)) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }

    public static boolean isPrime(int num) {
        if(num < 2) return false;
        for(int i = 2; i * i <= num; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
}
