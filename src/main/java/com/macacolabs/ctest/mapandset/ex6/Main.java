package com.macacolabs.ctest.mapandset.ex6;
// https://www.acmicpc.net/problem/1764

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Set<String> plist = new HashSet<>();

        for(int i = 0; i < N; i++) {
            plist.add(br.readLine());
        }

        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < M; i++){
            String target = br.readLine();
            if(plist.contains(target)) {
                list.add(target);
            }
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        sb.append(list.size()).append('\n');
        for(String s : list) {
            sb.append(s).append('\n');
        }

        System.out.println(sb);
    }
}
