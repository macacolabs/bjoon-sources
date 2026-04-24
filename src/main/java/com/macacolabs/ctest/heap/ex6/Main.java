package com.macacolabs.ctest.heap.ex6;
// https://www.acmicpc.net/problem/1202
import java.io.*;
import java.util.*;

class Gem implements Comparable<Gem> {
    int weight, value;
    Gem(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
    @Override
    public int compareTo(Gem o) {
        return this.weight - o.weight;
    }
}

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Gem[] gems = new Gem[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            gems[i] = new Gem(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        Arrays.sort(gems);

        int[] bags = new int[K];
        for (int i = 0; i < K; i++) {
            bags[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(bags);

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        long totalPrice = 0;
        int gemIdx = 0;

        for (int i = 0; i < K; i++) {
            while (gemIdx < N && gems[gemIdx].weight <= bags[i]) {
                pq.add(gems[gemIdx].value);
                gemIdx++;
            }

            if (!pq.isEmpty()) {
                totalPrice += pq.poll();
            }
        }

        System.out.println(totalPrice);
    }

}
