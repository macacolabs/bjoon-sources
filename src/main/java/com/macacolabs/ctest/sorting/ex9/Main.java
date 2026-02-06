package com.macacolabs.ctest.sorting.ex9;

// https://www.acmicpc.net/problem/1181
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Set<String> set = new TreeSet<>();

        for(int i = 0; i < N; i++) set.add(br.readLine());

        ArrayList<String> list = new ArrayList<>(set);

        Collections.sort(list, (a, b) -> {
            if(a.length() == b.length()) {
                return a.compareTo(b);
            }
            return a.length() - b.length();
        });
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < list.size(); i++){
            sb.append(list.get(i)).append('\n');
        }
        System.out.println(sb);
    }
}
