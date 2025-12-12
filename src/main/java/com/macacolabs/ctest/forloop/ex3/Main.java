package com.macacolabs.ctest.forloop.ex3;
// https://www.acmicpc.net/problem/8393

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());

            int sum = 0;
            for(int i = 1; i <= n; i++){
                sum += i;
            }
            System.out.println(sum);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
