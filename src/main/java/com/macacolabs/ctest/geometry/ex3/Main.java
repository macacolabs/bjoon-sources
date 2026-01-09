package com.macacolabs.ctest.geometry.ex3;
// https://www.acmicpc.net/problem/3009

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] x = new int[3];
        int[] y = new int[3];

        for(int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        int targetX, targetY;
        if(x[0] == x[1]) {
            targetX = x[2];
        } else if(x[0] == x[2]) {
            targetX = x[1];
        } else {
            targetX = x[0];
        }

        if(y[0] == y[1]) {
            targetY = y[2];
        } else if(y[0] == y[2]) {
            targetY = y[1];
        } else {
            targetY = y[0];
        }

        System.out.println(targetX + " " + targetY);
    }
}
