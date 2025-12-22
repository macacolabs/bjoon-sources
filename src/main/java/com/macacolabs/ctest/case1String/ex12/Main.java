package com.macacolabs.ctest.case1String.ex12;
// https://www.acmicpc.net/problem/1316

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i = 0; i < N; i++){
            if(check()){
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean check() throws IOException {
        boolean[] check = new boolean[26];

        int prev = 0;
        String str = br.readLine();

        for(int i = 0; i < str.length(); i++){
            int now = str.charAt(i);

            if(prev != now) {
                if(check[now - 'a']){
                    return false;
                } else {
                    check[now - 'a'] = true;
                    prev = now;
                }
            }
        }
        return true;
    }
}
