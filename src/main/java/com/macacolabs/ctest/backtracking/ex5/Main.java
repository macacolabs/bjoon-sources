package com.macacolabs.ctest.backtracking.ex5;
// https://www.acmicpc.net/problem/9663

import java.io.*;

public class Main {
    static int N;
    static int[] arr;
    static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        dfs(0);
        System.out.println(count);
    }

    public static void dfs(int depth) {

        if(depth == N) {
            count++;
            return;
        }

        for(int i = 0; i < N; i++) {

            arr[depth] = i;

            if (isSafe(depth)) {

                dfs(depth + 1);
            }
        }

    }

    public static boolean isSafe(int depth) {

        for (int row = 0; row < depth; row++) {
            // 같은  세로줄에 있나?
            if (arr[depth] == arr[row]) {
                return false;
            }
            // 대각선에 있나?(행의 차이 == 열의 차이)
            else if (Math.abs(depth - row) == Math.abs(arr[depth] - arr[row])) {
                return false;
            }
        }
        return true;
    }
}
