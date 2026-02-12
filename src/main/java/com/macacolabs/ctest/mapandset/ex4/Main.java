package com.macacolabs.ctest.mapandset.ex4;

// https://www.acmicpc.net/problem/1620

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<Integer, String> numberkeys = new HashMap<>();
        Map<String, Integer> stringkeys = new HashMap<>();
        for(int i = 1; i <= N; i++){
            String str = br.readLine();
            stringkeys.put(str, i);
            numberkeys.put(i, str);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++){
            String str = br.readLine();

            if(Character.isDigit(str.charAt(0))){
                sb.append(numberkeys.get(Integer.parseInt(str))).append('\n');
            } else {
                sb.append(stringkeys.get(str)).append('\n');
            }
        }
        System.out.println(sb);
    }
}
