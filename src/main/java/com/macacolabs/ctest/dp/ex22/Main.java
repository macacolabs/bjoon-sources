package com.macacolabs.ctest.dp.ex22;
// https://www.acmicpc.net/problem/25682

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M, K;
    static char[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        board = new char[N + 1][M + 1];
        for (int i = 1; i <= N; i++) {
            String line = br.readLine();
            for (int j = 1; j <= M; j++) {
                board[i][j] = line.charAt(j - 1);
            }
        }

        System.out.println(Math.min(solve('B'), solve('W')));
    }

    public static int solve(char color) {
        int[][] dp = new int[N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                int check = 0;
                char target;
                if ((i + j) % 2 == 0) target = color;
                else target = (color == 'B') ? 'W' : 'B';

                if (board[i][j] != target) check = 1;

                dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1] + check;
            }
        }

        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= N - K + 1; i++) {
            for (int j = 1; j <= M - K + 1; j++) {
                int x2 = i + K - 1;
                int y2 = j + K - 1;

                int res = dp[x2][y2] - dp[i - 1][y2] - dp[x2][j - 1] + dp[i - 1][j - 1];
                min = Math.min(min, res);
            }
        }
        return min;
    }
}
