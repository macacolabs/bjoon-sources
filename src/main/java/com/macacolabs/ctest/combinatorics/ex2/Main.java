package com.macacolabs.ctest.combinatorics.ex2;
// https://www.acmicpc.net/problem/24723

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        System.out.println(1 << N);
    }
}
