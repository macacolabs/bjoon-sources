package com.macacolabs.ctest.backtracking.ex6;
// https://www.acmicpc.net/problem/2580

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr = new int[9][9];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0,0);
    }

    public static boolean dfs(int row, int col) {

        if (col == 9) {
           return dfs(row + 1, 0);
        }

        if(row == 9) {
            printResult();
            return true;
        }

        if (arr[row][col] == 0) {
            for (int i = 1; i <= 9; i++) {
                if (isPossible(row, col, i)) {
                    arr[row][col] = i;

                    if (dfs(row, col + 1)) {
                        return true;
                    }

                    arr[row][col] = 0;
                }
            }
            return false;
        }

        return dfs(row, col + 1);
    }

    public static boolean isPossible(int row, int col, int value) {
        for (int i = 0; i < 9; i++) {

            if (arr[row][i] == value || arr[i][col] == value) return false;
        }

        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (arr[i][j] == value) return false;
            }
        }
        return true;
    }

    public static void printResult() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sb.append(arr[i][j]).append(' ');
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}
