package com.macacolabs.ctest.case1String.ex6;
// https://www.acmicpc.net/problem/10809

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String str = br.readLine();
            int[] arr = new int[26];
            for(int i = 0; i < arr.length; i++){
                arr[i] = -1;
            }

           for(int i = 0; i < str.length(); i++){
               char ch = str.charAt(i);
               if(arr[ch - 'a'] == -1){
                   arr[ch - 'a'] = i;
               }
           }

           for(int i : arr){
               System.out.print(i + " ");
           }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
