package com.macacolabs.ctest.array.ex11;
// https://www.acmicpc.net/problem/3003

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] iarr = {1, 1, 2, 2, 2, 8};

        for(int i = 0; i < iarr.length; i++){
            iarr[i] = iarr[i] - Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.print(iarr[i] + " ");
        }
    }
}
