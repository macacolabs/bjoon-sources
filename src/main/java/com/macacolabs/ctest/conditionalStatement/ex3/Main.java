package com.macacolabs.ctest.conditionalStatement.ex3;
// https://www.acmicpc.net/problem/2753
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int year = Integer.parseInt(br.readLine());

            if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(1);
            } else  {
                System.out.println(0);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
