package com.macacolabs.ctest.geometry.ex2;
// https://www.acmicpc.net/problem/1085

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        int xMin = Math.min(X, (W - X));
        int yMin = Math.min(Y, (H - Y));

        System.out.println(Math.min(xMin, yMin));
    }
}
