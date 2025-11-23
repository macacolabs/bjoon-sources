package com.macacolabs.ctest.case1String.ex10;
// https://www.acmicpc.net/problem/2675
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int num = Integer.parseInt(br.readLine());

            for(int i = 0; i < num; i++){

                String[] strArr = br.readLine().split(" ");
                int count = Integer.parseInt(strArr[0]);
                String s = strArr[1];

                for(int j = 0; j < s.length(); j++){
                    for(int k = 0; k < count; k++){
                        System.out.print(s.charAt(j));
                    }
                }
                System.out.println();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
