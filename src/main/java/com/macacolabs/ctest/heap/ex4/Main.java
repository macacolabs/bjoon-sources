package com.macacolabs.ctest.heap.ex4;

// https://www.acmicpc.net/problem/2075
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                int num = Integer.parseInt(st.nextToken());

                if(pq.size() < N) {
                    pq.add(num);
                } else {
                    if(pq.peek() < num) {
                        pq.poll();
                        pq.add(num);
                    }
                }
            }
        }
        System.out.println(pq.peek());
    }
}
