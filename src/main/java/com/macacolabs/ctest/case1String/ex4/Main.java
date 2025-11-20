package com.macacolabs.ctest.case1String.ex4;
//https://www.acmicpc.net/problem/11654

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            char input = br.readLine().charAt(0);
            System.out.println((int) input);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
