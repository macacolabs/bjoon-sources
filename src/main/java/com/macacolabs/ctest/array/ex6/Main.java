package com.macacolabs.ctest.array.ex6;
// https://www.acmicpc.net/problem/10813
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int[] iarr = new int[M];
            for (int i = 0; i < M; i++) {
                iarr[i] = i + 1;
            }

            for(int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                int I = Integer.parseInt(st.nextToken());
                int J = Integer.parseInt(st.nextToken());

                int temp = iarr[I-1];
                iarr[I-1] = iarr[J-1];
                iarr[J-1] = temp;
            }

            for(int i = 0; i < M; i++) {
                System.out.print(iarr[i] + " ");
            }

        } catch (IOException e) {
       }
    }
}
