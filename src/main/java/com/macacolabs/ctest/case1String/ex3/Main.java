package com.macacolabs.ctest.case1String.ex3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//        https://www.acmicpc.net/problem/2743
public class Main {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = br.readLine();
            System.out.println(str.length());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
