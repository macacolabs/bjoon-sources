package com.macacolabs.ctest.dp.ex20;

// https://www.acmicpc.net/problem/10986

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] dp = new int[N + 1];
        int[] cnt = new int[M];

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++) {
            dp[i] = (dp[i - 1] + Integer.parseInt(st.nextToken())) % M;
            cnt[dp[i]]++;
        }

        long result = cnt[0];

        for(int i = 0; i < M; i++) {
            result += (long)cnt[i] * (cnt[i] - 1) / 2;
        }

        System.out.println(result);
    }
}
