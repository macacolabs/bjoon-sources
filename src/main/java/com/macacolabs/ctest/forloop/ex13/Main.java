package com.macacolabs.ctest.forloop.ex13;
// https://www.acmicpc.net/problem/1157

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toUpperCase();

        int[] iarr = new int[26];
        for(int i = 0; i < str.length(); i++) {
            iarr[str.charAt(i) - 'A']++;
        }

        int max = -1;
        char result = '?';

        for (int i = 0; i < 26; i++) {
            if (iarr[i] > max) {
                max = iarr[i];
                result = (char) (i + 'A');
            } else if (iarr[i] == max) {
                result = '?';
            }
        }

        System.out.println(result);

//        int max = 0;
//        int index = 0;
//        int check = 0;
//        for(int i = 0; i < iarr.length; i++) {
//
//            if(iarr[i] > max) {
//                max = iarr[i];
//                index = i;
//            }
//        }
//
//        for(int i = 0; i < iarr.length; i++) {
//            if(iarr[i] == max) {
//                check++;
//            }
//        }
//
//        System.out.println(check >= 2 ? "?" : (char)(index + 'A'));
    }
}
