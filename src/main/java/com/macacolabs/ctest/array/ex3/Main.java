package com.macacolabs.ctest.array.ex3;
// https://www.acmicpc.net/problem/10818

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int num = Integer.parseInt(br.readLine());

            String data = br.readLine();
            int[] iarr = new int[num];
            StringTokenizer str = new StringTokenizer(data, " ");
            for(int i = 0; i < iarr.length; i++){
                iarr[i] = Integer.parseInt(str.nextToken());
            }

            System.out.print(Arrays.stream(iarr).min().getAsInt() + " " +  Arrays.stream(iarr).max().getAsInt());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
