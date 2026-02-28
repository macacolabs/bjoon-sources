package com.macacolabs.ctest.sqd.ex3;
// https://www.acmicpc.net/problem/9012

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < T; i++) {
            String str = br.readLine();
            int count = 0;
            boolean isBalanced = true;

            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == '(') {
                    count++;
                } else {
                    if(count == 0) {
                        isBalanced = false;
                        break;
                    } else {
                        count--;
                    }
                }
            }

            if(isBalanced && count == 0){
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }

        }
        System.out.println(sb);
    }
}
