package com.macacolabs.ctest.heap.ex3;
// https://www.acmicpc.net/problem/11286

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> absHeap = new PriorityQueue<>((o1, o2) -> {
            int abs1 = Math.abs(o1);
            int abs2 = Math.abs(o2);

            if (abs1 == abs2) {
                return o1 - o2;
            }
            return abs1 - abs2;
        });
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x == 0) {
                if (absHeap.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(absHeap.poll()).append("\n");
                }
            } else {
                absHeap.add(x);
            }
        }
        System.out.print(sb);
    }
}
