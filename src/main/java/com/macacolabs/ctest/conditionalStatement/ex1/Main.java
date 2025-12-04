package com.macacolabs.ctest.conditionalStatement.ex1;

// https://www.acmicpc.net/problem/1330
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

            String result = "";
            if(A > B) {
                result = ">";
            } else if(A < B) {
                result = "<";
            } else if(B == A) {
                result = "==";
            }
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

