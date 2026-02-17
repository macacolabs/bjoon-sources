package com.macacolabs.ctest.lcm.ex1;
// https://www.acmicpc.net/problem/1934

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int gcdNum = gcd(A, B);
            sb.append((A * B) / gcdNum).append('\n'); // lcm = (a * b) / gcd
        }
        System.out.println(sb);
    }

    //최대공약수(gcd(a,b) = gcd(b, a%b))활용
    public static int gcd(int a, int b) {
        if(b == 0) return a;

        return gcd(b, a % b);
    }

    public static int fgcd(int a, int b) {
        if(b != 0) {
            int temp = a % b; // 나머지 먼저 구현
            a = b;            // b와 a의 자라바꿈
            b = temp;         // 나머지를 b로옮김
        }
        return a;
    }
}
