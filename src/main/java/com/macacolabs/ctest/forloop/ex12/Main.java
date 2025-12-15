package com.macacolabs.ctest.forloop.ex12;
// https://www.acmicpc.net/problem/10951


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str;

        try {
            while ((str = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(str);
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());
                sb.append(A + B).append("\n");
            }

            System.out.print(sb.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
