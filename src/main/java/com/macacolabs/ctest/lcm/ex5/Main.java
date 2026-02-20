package com.macacolabs.ctest.lcm.ex5;
// https://www.acmicpc.net/problem/4134

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            long p = Long.parseLong(br.readLine());

            while(true) {

                if(isPrime(p)) {
                    sb.append(p).append("\n");
                    break;
                }
                p++;
            }
        }
        System.out.println(sb);
    }

    public static boolean isPrime(long num) {
        if (num < 2) return false;
        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
