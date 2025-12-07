package com.macacolabs.ctest.conditionalStatement.ex7;
// https://www.acmicpc.net/problem/2480

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            int n3 = Integer.parseInt(st.nextToken());

            if(n1 != n2 && n2 != n3 && n1 != n3) {
                int max;
                if (n1 > n2) {
                    if (n3 > n1) {
                        max = n3;
                    }
                    else {
                        max = n1;
                    }
                }
                else {
                    if (n3 > n2) {
                        max = n3;
                    }
                    else {
                        max = n2;
                    }
                }
                System.out.println(max * 100);
            } else {
                if(n1 == n2 && n1 == n3) {
                    System.out.println(10000 + n1 * 1000);
                } else {
                    if(n1 == n2 || n1 == n3) {
                        System.out.println(1000 + n1 * 100);
                    } else {
                        System.out.println(1000 + n2 * 100);
                    }
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
