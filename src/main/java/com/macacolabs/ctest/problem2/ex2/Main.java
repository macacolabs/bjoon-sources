package com.macacolabs.ctest.problem2.ex2;
// https://www.acmicpc.net/problem/25192

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        HashSet<String> hset = new HashSet<>();
        int count = 0;
        for(int i = 0; i < N; i++) {
            String str = br.readLine();

            if("ENTER".equals(str)){
                hset.clear();
            } else {
                if(hset.add(str)) count++;
            }
        }

        System.out.println(count);
    }
}
