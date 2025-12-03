package com.macacolabs.ctest.array.ex9;
// https://www.acmicpc.net/problem/10811
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int[] arr = new int[N];
            for(int i = 0; i < N; i++){
                arr[i] = i + 1;
            }
            int temp = 0;
            for(int i = 0; i < M; i++){
                st = new StringTokenizer(br.readLine());
                int I = Integer.parseInt(st.nextToken()) - 1;
                int J = Integer.parseInt(st.nextToken()) - 1;

                while(I < J) {
                    temp = arr[I];
                    arr[I] = arr[J];
                    arr[J] = temp;
                    I++;
                    J--;
                }
            }

            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
