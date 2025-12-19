package com.macacolabs.ctest.print.ex15;
// https://www.acmicpc.net/problem/10988
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int result = 0;

        String revers = "";
        for(int i = str.length() - 1; i >= 0; i--){
            revers += str.charAt(i);
        }

        if(str.equals(revers)){
            result = 1;
        }
        System.out.println(result);
    }
}
