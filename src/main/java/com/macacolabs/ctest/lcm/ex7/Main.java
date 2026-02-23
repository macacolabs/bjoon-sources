package com.macacolabs.ctest.lcm.ex7;
// https://www.acmicpc.net/problem/4948

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static boolean[] isNotPrime = new boolean[246913];
    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       getPrime();

       while(true) {

           int n = Integer.parseInt(br.readLine());
           if(n == 0) break;

           int count = 0;
           for(int i = n + 1; i <= 2 * n; i++) {
               if(!isNotPrime[i]) {
                   count++;
               }
           }
           System.out.println(count);
       }
    }

    public static void getPrime() {
        isNotPrime[0] = isNotPrime[1] = true;

        for (int i = 2; i * i < isNotPrime.length; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j < isNotPrime.length; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }
    }
}
