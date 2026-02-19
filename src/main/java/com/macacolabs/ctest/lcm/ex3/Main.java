package com.macacolabs.ctest.lcm.ex3;
// https://www.acmicpc.net/problem/1735

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

       int num = (a * d) + (c * b);
       int den = b * d;

       int gcdNum = gcd(num, den);
        System.out.println((num / gcdNum) + " " + (den / gcdNum));
    }

    public static int gcd(int a, int b) {
        while(b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
