package com.macacolabs.ctest.sqd.ex8;
// https://www.acmicpc.net/problem/11866

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        int[] q = new int[N * K + 1];
        int front = 0;
        int rear = 0;

        for(int i = 1; i <= N; i++) {
            q[rear++] = i;
        }
        sb.append("<");
        while(rear - front > 0) {
            for(int i = 0; i < K - 1; i++) {
                q[rear++] = q[front++];
            }
            sb.append(q[front++]);

            if(rear - front > 0) {
                sb.append(", ");
            }
        }
        sb.append(">");
        System.out.println(sb);
    }
}
