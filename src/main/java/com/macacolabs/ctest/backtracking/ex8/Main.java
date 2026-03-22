package com.macacolabs.ctest.backtracking.ex8;
// https://www.acmicpc.net/problem/14889

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] S;
    static boolean[] visited;
    static int minDiff = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        S = new int[N][N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                S[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        divideTeam(0, 0);
        System.out.println(minDiff);
    }

    public static void divideTeam(int idx, int count) {
        if (count == N / 2) {
            calculateDiff();
            return;
        }

        for (int i = idx; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                divideTeam(i + 1, count + 1);
                visited[i] = false;
            }
        }
    }

    public static void calculateDiff() {
        int startTeam = 0;
        int linkTeam = 0;

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (visited[i] && visited[j]) {
                    startTeam += S[i][j] + S[j][i];
                }
                else if (!visited[i] && !visited[j]) {
                    linkTeam += S[i][j] + S[j][i];
                }
            }
        }

        int diff = Math.abs(startTeam - linkTeam);

        if (diff == 0) {
            System.out.println(0);
            System.exit(0);
        }

        minDiff = Math.min(minDiff, diff);
    }
}
