package com.macacolabs.ctest.case1String.ex5;

//https://www.acmicpc.net/problem/11720
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int num = Integer.parseInt(br.readLine());
            String str = br.readLine();

//            char[] arr = str.toCharArray();
            long sum = 0;
            for (int i = 0; i < str.length(); i++) {
//                sum += Integer.parseInt(String.valueOf(arr[i]));
                sum += str.charAt(i) - '0';
            }
            System.out.println(sum);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
