package com.macacolabs.ctest.geometry.ex8;
// https://www.acmicpc.net/problem/14215

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new  StringTokenizer(br.readLine());

        int[] iarr = new int[3];
        iarr[0] = Integer.parseInt(st.nextToken());
        iarr[1] = Integer.parseInt(st.nextToken());
        iarr[2] = Integer.parseInt(st.nextToken());

        Arrays.sort(iarr);

        if(iarr[2] < iarr[0] + iarr[1]){
            System.out.println(iarr[0] + iarr[1] + iarr[2]);
        } else {
            int newLength = (iarr[0] + iarr[1]) - 1;
            System.out.println((iarr[0] + iarr[1]) + newLength);
        }
    }
}
