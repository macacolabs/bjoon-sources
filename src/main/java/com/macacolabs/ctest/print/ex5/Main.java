package com.macacolabs.ctest.print.ex5;
// https://www.acmicpc.net/problem/1008
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double A = Double.parseDouble(st.nextToken());
            double B = Double.parseDouble(st.nextToken());
            System.out.println(A / B);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
