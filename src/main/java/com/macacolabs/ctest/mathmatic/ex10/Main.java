package com.macacolabs.ctest.mathmatic.ex10;
// https://www.acmicpc.net/problem/9506

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            int N = Integer.parseInt(br.readLine());
            if(N == -1) break;

            List<Integer> list = new ArrayList<>();
            int sum = 0;

            for(int i = 1; i <= N / 2; i++) {
                if(N % i == 0) {
                    list.add(i);
                    sum += i;
                }
            }

            if(sum == N) {
                sb.append(N).append(" = ");
                for(int i = 0; i < list.size(); i++) {
                    sb.append(list.get(i));
                    if(i != list.size() - 1) {
                        sb.append(" + ");
                    }
                }
                sb.append("\n");
            } else {
                sb.append(N).append(" is NOT perfect.\n");
            }
        }
        System.out.println(sb);
    }
}
