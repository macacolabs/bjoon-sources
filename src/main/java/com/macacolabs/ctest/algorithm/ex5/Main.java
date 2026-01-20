package com.macacolabs.ctest.algorithm.ex5;
// https://www.acmicpc.net/problem/24266

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Long.parseLong(br.readLine());

        System.out.println(N * N * N);
        System.out.println(3);
    }
}
