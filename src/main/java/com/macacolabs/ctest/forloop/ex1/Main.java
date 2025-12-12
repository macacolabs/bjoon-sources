package com.macacolabs.ctest.forloop.ex1;

//https://www.acmicpc.net/problem/2739
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int N = Integer.parseInt(br.readLine());

            for(int i = 1; i <= 9; i++ ){
                System.out.println(N + " * " +  i + " = " + (N * i));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
