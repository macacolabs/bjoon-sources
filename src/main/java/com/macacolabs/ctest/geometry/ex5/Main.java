package com.macacolabs.ctest.geometry.ex5;
// https://www.acmicpc.net/problem/9063

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if(x < minX) minX = x;
            if(y < minY) minY = y;

            if(x > maxX) maxX = x;
            if(y > maxY) maxY = y;
        }

        System.out.println((maxX - minX) * (maxY - minY));
    }
}
