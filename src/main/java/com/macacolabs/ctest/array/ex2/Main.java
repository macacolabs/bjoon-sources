package com.macacolabs.ctest.array.ex2;
//https://www.acmicpc.net/problem/10871

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            String data =  br.readLine();

            StringTokenizer str2 = new StringTokenizer(data, " ");
            for(int i = 0; i < n; i++){
                int check = Integer.parseInt(str2.nextToken());
                if(check < m) {
                    System.out.print(check + " ");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
