package com.macacolabs.ctest.heap.ex2;
// https://www.acmicpc.net/problem/1927

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());

            if(x == 0) {
                if(minHeap.isEmpty()) sb.append(0).append("\n");
                else sb.append(minHeap.poll()).append("\n");
            } else {
                minHeap.add(x);
            }
        }

        System.out.println(sb);
    }
}
