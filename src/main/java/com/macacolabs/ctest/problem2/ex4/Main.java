package com.macacolabs.ctest.problem2.ex4;
// https://www.acmicpc.net/problem/2108

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        int[] count = new int[8001];
        double sum = 0;
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            count[arr[i] + 4000]++;
        }

        System.out.println(Math.round( sum / N));
        Arrays.sort(arr);
        System.out.println(arr[N / 2]);

        int maxFreq = 0;
        for (int i = 0; i < 8001; i++) {
            if (count[i] > maxFreq) {
                maxFreq = count[i];
            }
        }

        int mode = 0;
        boolean isSecond = false;
        for (int i = 0; i < 8001; i++) {
            if (count[i] == maxFreq) {
                mode = i - 4000;
                if (isSecond) {
                    break;
                }
                isSecond = true;
            }
        }
        System.out.println(mode);

        System.out.println(arr[N - 1] - arr[0]);
    }
}
