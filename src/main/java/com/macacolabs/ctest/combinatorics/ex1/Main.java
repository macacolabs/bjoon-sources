package com.macacolabs.ctest.combinatorics.ex1;
// https://www.acmicpc.net/step/61

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println(N * (N - 1));
    }
}
