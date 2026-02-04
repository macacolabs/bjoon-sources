package com.macacolabs.ctest.sorting.ex7;
// https://www.acmicpc.net/problem/11650

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] iarr = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            iarr[i][0] = Integer.parseInt(st.nextToken());
            iarr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(iarr, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            } else  {
                return a[0] - b[0];
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            sb.append(iarr[i][0] + " " + iarr[i][1] + "\n");
        }
        System.out.println(sb);
    }
}
