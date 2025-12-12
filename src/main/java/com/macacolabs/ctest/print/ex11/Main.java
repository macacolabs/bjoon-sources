package com.macacolabs.ctest.print.ex11;

// https://www.acmicpc.net/problem/11382

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            StringTokenizer st = new StringTokenizer(br.readLine());

            long A = Long.parseLong(st.nextToken());
            long B = Long.parseLong(st.nextToken());
            long C = Long.parseLong(st.nextToken());

            System.out.println((A + B + C));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
