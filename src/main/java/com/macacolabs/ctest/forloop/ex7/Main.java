package com.macacolabs.ctest.forloop.ex7;
// https://www.acmicpc.net/problem/11021


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int T = Integer.parseInt(br.readLine());

            for(int i = 0; i < T; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());

                System.out.println("Case #" + (i + 1) + ": " + (A + B));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
