package com.macacolabs.ctest.lcm.ex2;
// https://www.acmicpc.net/problem/13241

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        long lcm = (A * B) / gcd(B, A);
        System.out.println(lcm);
    }

    public static long gcd(long a, long b) {
        while(b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
