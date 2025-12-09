package com.macacolabs.ctest.print.ex8;
// https://www.acmicpc.net/problem/18108

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int y = Integer.parseInt(br.readLine());

            System.out.println(y - 543);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
