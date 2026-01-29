package com.macacolabs.ctest.sorting.ex1;
// https://www.acmicpc.net/problem/2750

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] iarr = new int[N];

        for(int i = 0; i < N; i++) {
            iarr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(iarr);

        for(int i : iarr) {
            System.out.println(i);
        }
    }
}
