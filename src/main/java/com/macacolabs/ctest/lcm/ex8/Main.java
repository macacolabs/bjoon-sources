package com.macacolabs.ctest.lcm.ex8;
// https://www.acmicpc.net/problem/17103

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        boolean[] isNotPrime = new boolean[1000001];
        isNotPrime[0] = isNotPrime[1] = true;

        for(int i = 2; i * i <= 1000000; i++) {
            if(!isNotPrime[i]){
                for(int j = i * i; j <= 1000000; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < T; i++){
            int n = Integer.parseInt(br.readLine());
            int count = 0;
            for(int j = 2; j <= n / 2; j++) {
                if(!isNotPrime[j] && !isNotPrime[n - j]) {
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}
