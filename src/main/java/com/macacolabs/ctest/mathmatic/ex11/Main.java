package com.macacolabs.ctest.mathmatic.ex11;
// https://www.acmicpc.net/problem/1978

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(isPrime(num)){
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean isPrime(int n){

        if(n < 2) return false;
        if(n == 2) return true;

        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
