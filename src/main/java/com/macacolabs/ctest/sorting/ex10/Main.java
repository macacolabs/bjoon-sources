package com.macacolabs.ctest.sorting.ex10;
// https://www.acmicpc.net/problem/10814

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[][] str = new String[N][2];
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            str[i][0] = st.nextToken();
            str[i][1] = st.nextToken();
        }

        Arrays.sort(str, (a, b) -> {
            int ageA = Integer.parseInt(a[0]);
            int ageB = Integer.parseInt(b[0]);

            return ageA - ageB;
        });
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            sb.append(str[i][0]).append(" ").append(str[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}
