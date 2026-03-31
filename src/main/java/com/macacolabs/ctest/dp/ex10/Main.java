package com.macacolabs.ctest.dp.ex10;

// https://www.acmicpc.net/problem/10844
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static long mod = 1000000000L;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long[][] dp = new long[N + 1][10];

        for(int i = 1; i <= 9; i++) {
            dp[1][i] = 1;
        }

        for(int n = 2; n <= N; n++) {
            for(int i = 0; i <= 9; i++) {
                if(i == 0) {
                    dp[n][0] = dp[n - 1][1] % mod;;
                } else if(i == 9) {
                    dp[n][9] = dp[n - 1][8] % mod;
                } else {
                    dp[n][i] = (dp[n - 1][i - 1] + dp[n - 1][i + 1]) % mod;
                }
            }
        }

        long result = 0;
        for(int i = 0; i <= 9; i++) {
            result += dp[N][i];
        }

        System.out.println(result % mod);
    }
}
