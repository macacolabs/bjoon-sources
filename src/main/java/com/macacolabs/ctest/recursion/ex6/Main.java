package com.macacolabs.ctest.recursion.ex6;
// https://www.acmicpc.net/problem/2447

import java.io.*;

public class Main {

    static char[][] arr;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        arr = new char[N][N];

        star(0, 0, N, false);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }

    public static void star(int x, int y, int size, boolean isblank) {
        if(isblank) {
            for(int i = x; i < x + size; i++){
                for (int j = y; j < y + size; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        if(size == 1) {
            arr[x][y] = '*';
            return;
        }

        int newSize = size / 3;
        int count = 0;
        for (int i = x; i < x + size; i += newSize) {
            for (int j = y; j < y + size; j += newSize) {
                count++;
                if (count == 5) {
                    star(i, j, newSize, true);
                } else {
                    star(i, j, newSize, false);
                }
            }
        }
    }
}
