package com.macacolabs.ctest.case1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    // https://www.acmicpc.net/problem/9086
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int num = Integer.parseInt(br.readLine());

            String[] sarr = new String[num];
            for(int i = 0; i < num; i++) {
                String str = br.readLine();
                sarr[i] = str.substring(0, 1) + str.substring(str.length() - 1, str.length());
            }
            for(String s: sarr) {
                System.out.println(s);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
