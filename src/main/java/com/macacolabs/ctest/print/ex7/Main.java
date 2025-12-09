package com.macacolabs.ctest.print.ex7;
// https://www.acmicpc.net/problem/10926
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String str = br.readLine();

            String id = str;
            if(str.equals(id)){
                System.out.println(str + "??!");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
