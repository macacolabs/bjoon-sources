package com.macacolabs.ctest.geometry.ex7;
// https://www.acmicpc.net/problem/5073
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            if(A == 0 && B == 0 && C == 0) break;

            if (A >= (B + C) || B >= (A + C) || C >= (A + B)) {
                System.out.println("Invalid");
            }
            else if (A == B && B == C) {
                System.out.println("Equilateral");
            }
            else if (A == B || B == C || A == C) {
                System.out.println("Isosceles");
            }
            else {
                System.out.println("Scalene");
            }
        }
    }
}
