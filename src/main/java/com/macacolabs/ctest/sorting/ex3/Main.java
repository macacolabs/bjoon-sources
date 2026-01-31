package com.macacolabs.ctest.sorting.ex3;
// https://www.acmicpc.net/problem/25305

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());


        int[] iarr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            iarr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(iarr);

        System.out.println(iarr[N - K]);
    }
}
