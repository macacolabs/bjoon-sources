package com.macacolabs.ctest.mapandset.ex5;
// https://www.acmicpc.net/problem/10816

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Map<Integer, Integer> myCards = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            Integer card = Integer.parseInt(st.nextToken());
            myCards.put(card, myCards.getOrDefault(card, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++){
            int target = Integer.parseInt(st.nextToken());
            if(myCards.containsKey(target)){
                sb.append(myCards.get(target)).append(" ");
            } else {
                sb.append("0").append(" ");
            }
        }
        System.out.println(sb);
    }
}
