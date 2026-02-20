package com.macacolabs.ctest.lcm.ex4;
// https://www.acmicpc.net/problem/2485

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] tree = new int[N];
        for(int i = 0; i < N; i++){
            tree[i] = Integer.parseInt(br.readLine());
        }

        int gcdNum = tree[1] - tree[0];
        for(int i = 2; i < N; i++) {
            int currentGap = tree[i] - tree[i - 1];
            gcdNum = gcd(gcdNum, currentGap);
        }

        int totalTree = (tree[N - 1] - tree[0]) / gcdNum + 1;
        System.out.println(totalTree - N);

    }

    public static int gcd(int a, int b) {
        while(b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
