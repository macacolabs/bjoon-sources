package com.macacolabs.ctest.forloop.ex6;
// https://www.acmicpc.net/problem/15552

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int T = Integer.parseInt(br.readLine());
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            for(int i = 0; i < T; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());

                bw.write((A + B) + "\n");
            }
            bw.flush();
            bw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
