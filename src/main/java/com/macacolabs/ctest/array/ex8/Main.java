package com.macacolabs.ctest.array.ex8;
// https://www.acmicpc.net/problem/3052

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        Set<Integer> set = new HashSet<>();
//        try {
//            for(int i = 0; i < 10; i++){
//                int num = Integer.parseInt(br.readLine());
//                set.add(num % 42);
//            }
//            System.out.println(set.size());
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        boolean[] barr = new boolean[42];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            for(int i = 0; i < 10; i++){
                int num = Integer.parseInt(br.readLine()) % 42;
                barr[num] = true;
            }

            int count = 0;

            for(boolean b : barr){
                if(b){
                    count++;
                }
            }

            System.out.println(count);
        } catch(Exception e){
            e.printStackTrace();
        }

    }
}
