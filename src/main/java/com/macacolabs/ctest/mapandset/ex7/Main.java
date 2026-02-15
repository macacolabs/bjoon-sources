package com.macacolabs.ctest.mapandset.ex7;

// https://www.acmicpc.net/problem/1269
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<Integer> set = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        int interCount = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            if(set.contains(Integer.parseInt(st.nextToken()))) {
                interCount++;
            }
        }

        System.out.println((N + M) - (interCount * 2));
    }
}
