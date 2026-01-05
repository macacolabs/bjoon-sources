package com.macacolabs.ctest.mathmatic.ex12;
//  https://www.acmicpc.net/problem/2581

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());


        int sum = 0;
        int min = Integer.MAX_VALUE;

        for(int i = M; i <= N; i++) {
            if(isPrime(i)) {
                sum += i;

                if(min == Integer.MAX_VALUE) {
                    min = i;
                }
            }
        }

        if(sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if(number == 2) return true;

        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0) return false;
        }
        return true;
    }
}
