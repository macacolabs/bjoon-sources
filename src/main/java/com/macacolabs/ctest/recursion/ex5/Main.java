package com.macacolabs.ctest.recursion.ex5;
// https://www.acmicpc.net/problem/4779

import java.io.*;

public class Main {

    static char[] answer;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while((input = br.readLine()) != null && !input.isEmpty()) {
            int n = Integer.parseInt(input);
            int len = (int) Math.pow(3, n);

            answer = new char[len];
            for(int i = 0; i < len; i++) {
                answer[i] = '-';
            }

            cantor(0, len);

            StringBuilder sb = new StringBuilder();
            for(char c : answer) {
                sb.append(c);
            }
            System.out.println(sb);
        }

    }

    public static void cantor(int start, int size) {

        if(size == 1) return;

        int newSize = size / 3;

        for(int i = start + newSize; i < start + (2 * newSize); i++) {
            answer[i] = ' ';
        }
        cantor(start, newSize);
        cantor(start + 2 * newSize, newSize);
    }
}
