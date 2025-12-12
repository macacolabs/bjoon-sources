package com.macacolabs.ctest.forloop.ex5;
//https://www.acmicpc.net/problem/25314

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int N = Integer.parseInt(br.readLine());

            int count = N / 4;

            String result = "";
            for(int i = 0; i < count; i++){
                result += "long ";
            }
            result += "int";
            System.out.println(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
