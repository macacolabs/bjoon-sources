package com.macacolabs.ctest.conditionalStatement.ex6;
// https://www.acmicpc.net/problem/2525

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
            int W = Integer.parseInt(st.nextToken());

            int T = Integer.parseInt(br.readLine());

            LocalTime time = LocalTime.of(H, W).plusMinutes(T);
            System.out.println(time.getHour() + " " + time.getMinute());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
