package com.macacolabs.ctest.conditionalStatement.ex5;
// https://www.acmicpc.net/problem/2884

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            LocalTime time = LocalTime.of(H, M).minusMinutes(45);

            System.out.println(time.getHour() + " " + time.getMinute());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
