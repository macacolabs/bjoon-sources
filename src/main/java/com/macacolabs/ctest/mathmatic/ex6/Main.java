package com.macacolabs.ctest.mathmatic.ex6;
// https://www.acmicpc.net/problem/1193

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());

        int line = 1;
        int sumCount = 0;

        while (true) {
            if (X <= sumCount + line) {

                int position = X - sumCount;

                if (line % 2 == 0) {
                    System.out.println(position + "/" + (line - position + 1));  // 짝수 라인: 분자 증가, 분모 감소
                } else {
                    System.out.println((line - position + 1) + "/" + position);  // 홀수 라인: 분자 감소, 분모 증가
                }
                break;
            }
            sumCount += line;
            line++;
        }
    }
}
