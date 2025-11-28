package com.macacolabs.ctest.array.ex5;

// https://www.acmicpc.net/problem/10810


import java.io.*;
import java.util.*;

public class Main {
   
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 5 
            int M = Integer.parseInt(st.nextToken()); // 4

            int[] arr = new int[N];

            for(int i = 0; i < M; i++){

                st = new StringTokenizer(br.readLine());
                int I = Integer.parseInt(st.nextToken());
                int J = Integer.parseInt(st.nextToken());
                int K = Integer.parseInt(st.nextToken());

                for(int j = I - 1; j < J; j++)  {
                    arr[j] = K;
                }
            }

           for(int i = 0; i < arr.length; i++){
               System.out.print(arr[i] + " ");
           }

        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
