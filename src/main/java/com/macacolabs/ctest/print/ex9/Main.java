package com.macacolabs.ctest.print.ex9;

// https://www.acmicpc.net/problem/10430

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            System.out.println((A + B)%C);
            System.out.println(((A % C) + (B % C))% C);
            System.out.println((A * B) % C);
            System.out.println(((A % C) * (B % C)) % C);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
