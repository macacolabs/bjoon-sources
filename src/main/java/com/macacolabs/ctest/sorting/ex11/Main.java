package com.macacolabs.ctest.sorting.ex11;
//https://www.acmicpc.net/problem/18870

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] origin = new int[N];
        int[] sorted = new int[N];
        for(int i = 0; i < N; i++) {
            origin[i] = sorted[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sorted);

        Map<Integer, Integer> map = new HashMap<>();
        int rank = 0;
        for(int v : sorted) {
            if(!map.containsKey(v)) {
                map.put(v, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int key : origin) {
            int r = map.get(key);
            sb.append(r).append(" ");
        }

        System.out.println(sb);
    }
}
