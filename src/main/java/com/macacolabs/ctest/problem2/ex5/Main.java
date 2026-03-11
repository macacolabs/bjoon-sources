package com.macacolabs.ctest.problem2.ex5;
// https://www.acmicpc.net/problem/20920

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < N; i++) {
            String str = br.readLine();

            if(str.length() < M) continue;

            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        List<String> words = new ArrayList<>(map.keySet());

        Collections.sort(words, (o1, o2) -> {
           if(map.get(o1) != map.get(o2))
               return map.get(o2) - map.get(o1);

           if(o1.length() != o2.length())
               return o2.length() - o1.length();

           return o1.compareTo(o2);
        });

        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word).append("\n");
        }
        System.out.print(sb);
    }
}
