package com.macacolabs.ctest.sorting.ex4;
// https://www.acmicpc.net/problem/2751

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < N; i++){
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for(int i : list) {
            sb.append(i).append("\n");
        }

        System.out.println(sb);
    }
}
