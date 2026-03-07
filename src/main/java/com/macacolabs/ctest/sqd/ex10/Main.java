package com.macacolabs.ctest.sqd.ex10;
// https://www.acmicpc.net/problem/2346

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<Ballon> deque = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++){
            deque.add(new Ballon(i, Integer.parseInt(st.nextToken())));
        }

        StringBuilder sb = new StringBuilder();
        while(!deque.isEmpty()){
            Ballon current = deque.pollFirst();
            sb.append(current.id).append(" ");

            if(deque.isEmpty()) break;

            int move = current.value;

            if(move > 0) {
                for(int i = 0; i < move - 1; i++) {
                    deque.addLast(deque.pollFirst());
                }
            } else {
                for(int i = 0; i < Math.abs(move); i++){
                    deque.addFirst(deque.pollLast());
                }
            }
        }
        System.out.println(sb);
    }
}

class Ballon {

    int id;
    int value;

    Ballon(int id, int value) {
        this.id = id;
        this.value = value;
    }
}
