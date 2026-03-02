package com.macacolabs.ctest.sqd.ex5;
// https://www.acmicpc.net/problem/12789

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < N; i++) {
            queue.add(Integer.parseInt(st.nextToken()));
        }
        Stack<Integer> stack = new Stack<>();
        int num = 1;

        while(!queue.isEmpty()) {
            if(queue.peek() == num) {
                queue.poll();
                num++;
            } else {
                if(!stack.isEmpty() && stack.peek() == num) {
                    stack.pop();
                    num++;
                } else {
                    stack.push(queue.poll());
                }
            }
        }

        while(!stack.isEmpty() && stack.peek() == num) {
            stack.pop();
            num++;
        }

        if(stack.isEmpty()) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}
