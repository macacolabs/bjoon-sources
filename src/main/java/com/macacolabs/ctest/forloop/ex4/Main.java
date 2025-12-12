package com.macacolabs.ctest.forloop.ex4;
// https://www.acmicpc.net/problem/25304

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int X = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());
            int sum = 0;
            for(int i = 0; i < N; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                sum += a * b;
            }
            System.out.println((X == sum) ? "Yes" : "No");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
