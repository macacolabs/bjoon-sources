package com.macacolabs.ctest.array.ex7;
// https://www.acmicpc.net/problem/5597
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int[] iarr = new int[30];


            for(int i = 0; i < 28; i++){
                int num = Integer.parseInt(br.readLine());

                iarr[num-1] = num;
            }

            for(int i = 0; i < iarr.length; i++){
                if(iarr[i] == 0) {
                    System.out.println((i + 1));
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
