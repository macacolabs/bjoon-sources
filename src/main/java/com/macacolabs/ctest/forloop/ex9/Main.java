package com.macacolabs.ctest.forloop.ex9;
// https://www.acmicpc.net/problem/2438

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int N = Integer.parseInt(br.readLine());

            for(int i = 1; i <= N; i++) {
                for(int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
