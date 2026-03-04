package com.macacolabs.ctest.sqd.ex7;
// https://www.acmicpc.net/problem/2164

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] q = new int[2 * N];
        int front = 0;
        int rear = 0;

        for(int i = 1; i <= N; i++){
            q[rear++] = i;
        }

        while(rear - front > 1) {
            front++;

            q[rear++] = q[front++];
        }

        System.out.println(q[front]);
    }
}
