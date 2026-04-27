package com.macacolabs.ctest.sqd.ex12;

// https://www.acmicpc.net/problem/9935
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String bomb = br.readLine();

        StringBuilder sb = new StringBuilder();
        int len = bomb.length();

        for(int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));

            if (sb.length() >= len) {
                boolean isBomb = true;


                for (int j = 0; j < len; j++) {
                    if (sb.charAt(sb.length() - len + j) != bomb.charAt(j)) {
                        isBomb = false;
                        break;
                    }
                }

                if (isBomb) {
                    sb.delete(sb.length() - len, sb.length());
                }
            }
        }
        if(sb.length() == 0) {
            System.out.println("FRULA");
        } else {
            System.out.println(sb);
        }
    }
}
