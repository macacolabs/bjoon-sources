package com.macacolabs.ctest.case1String.ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    // https://www.acmicpc.net/problem/27866
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String str = br.readLine();
            String input = br.readLine();

            int num = Integer.parseInt(input);
            String result = str.substring(num-1,num);
            System.out.println(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
