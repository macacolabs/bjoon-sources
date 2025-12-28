package com.macacolabs.ctest.mathmatic.ex4;
// https://www.acmicpc.net/problem/2903

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int result = (1 << N) + 1;
        System.out.println(result * result);
    }
}
