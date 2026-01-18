package com.macacolabs.ctest.algorithm.ex4;
// https://www.acmicpc.net/problem/24265
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Long.parseLong(br.readLine());

        System.out.println((N * (N - 1)) / 2);
        System.out.println(2);
    }
}
