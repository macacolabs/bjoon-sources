package com.macacolabs.ctest.lcm.ex9;
// https://www.acmicpc.net/problem/13909

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println((int)Math.sqrt(N));
    }
}
