package com.macacolabs.ctest.array.ex10;

//https://www.acmicpc.net/problem/1546

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int N = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[N];
            for(int i = 0; i < N; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            double M = Arrays.stream(arr).max().getAsInt();
            double[] rarr = new double[N];
            for(int i = 0; i < N; i++){
                rarr[i] = arr[i]/M * 100;
            }
            System.out.println(Arrays.stream(rarr).average().getAsDouble());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
