package com.macacolabs.ctest.dp;

// https://www.acmicpc.net/problem/1932

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] origin = new int[n][n];
        int[][] dp = new int[n][n];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j <= i; j++) {
                origin[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[0][0] = origin[0][0];

        for(int i = 1; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                if(j == 0) {
                    dp[i][j] = dp[i - 1][j] + origin[i][j];
                } else if (j == i) {
                    dp[i][j] = dp[i - 1][j - 1] + origin[i][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + origin[i][j];
                }
            }
        }

        int max = 0;
        for (int j = 0; j < n; j++) {
            max = Math.max(max, dp[n - 1][j]);
        }
        System.out.println(max);
    }
}
