package com.macacolabs.ctest.heap.ex5;
// https://www.acmicpc.net/problem/2696

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int M = Integer.parseInt(br.readLine());
            System.out.println((M + 1) / 2);

            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();

            int count = 0;
            StringTokenizer st = null;

            for (int i = 0; i < M; i++) {
                if (i % 10 == 0) {
                    st = new StringTokenizer(br.readLine());
                }

                int num = Integer.parseInt(st.nextToken());

                if (maxHeap.size() == minHeap.size()) maxHeap.add(num);
                else minHeap.add(num);

                if (!minHeap.isEmpty() && maxHeap.peek() > minHeap.peek()) {
                    int temp1 = maxHeap.poll();
                    int temp2 = minHeap.poll();
                    maxHeap.add(temp2);
                    minHeap.add(temp1);
                }

                if (i % 2 == 0) {
                    System.out.print(maxHeap.peek() + " ");
                    count++;
                    if (count % 10 == 0) System.out.println();
                }
            }
            if (count % 10 != 0) System.out.println();
        }

    }
}
