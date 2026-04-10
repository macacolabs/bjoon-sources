package com.macacolabs.ctest.dp.ex19;

// https://www.acmicpc.net/problem/16139

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int len = S.length();

        int[][] dp = new int[len][26];

        for(int i = 0; i < len; i++) {
           if(i > 0) {
               for(int j = 0; j < 26; j++) {
                   dp[i][j] = dp[i - 1][j];
               }
           }
           dp[i][S.charAt(i) - 'a']++;
        }

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int charIdx = st.nextToken().charAt(0) - 'a';
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            int result = dp[r][charIdx];
            if (l > 0) {
                result -= dp[l - 1][charIdx];
            }

            sb.append(result).append("\n");

        }

        System.out.println(sb);
    }
}
