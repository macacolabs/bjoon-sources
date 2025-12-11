package com.macacolabs.ctest.print.ex10;
// https://www.acmicpc.net/problem/2588

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int A = Integer.parseInt(br.readLine());
            String B = br.readLine();

            System.out.println(A * Integer.parseInt(String.valueOf(B.charAt(2))));
            System.out.println(A * Integer.parseInt(String.valueOf(B.charAt(1))));
            System.out.println(A * Integer.parseInt(String.valueOf(B.charAt(0))));
            System.out.println(A * Integer.parseInt(B));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
