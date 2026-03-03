package com.macacolabs.ctest.sqd.ex6;
// https://www.acmicpc.net/problem/18258

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] q = new int[N];
        int front = 0;
        int rear = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            String str = st.nextToken();
            switch(str) {
                case "push" :
                    int x = Integer.parseInt(st.nextToken());
                    q[rear++] = x;
                    break;
                case "pop":
                    if(rear == front )
                        sb.append("-1\n");
                    else
                        sb.append(q[front++]).append("\n");
                    break;
                case "size":
                    sb.append(rear - front).append("\n");
                    break;
                case "empty":
                    if(rear == front)
                        sb.append("1\n");
                    else
                        sb.append("0\n");
                    break;
                case "front":
                    if(rear == front)
                        sb.append("-1\n");
                    else
                        sb.append(q[front]).append("\n");
                    break;
                case "back":
                    if(rear == front)
                        sb.append("-1\n");
                    else
                        sb.append(q[rear - 1]).append("\n");
                    break;
            }
        }
        System.out.print(sb);
    }
}
