package com.macacolabs.ctest.dimensionalarray.ex2;
// https://www.acmicpc.net/problem/2566
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] iarr = new int[9][9];

        int max = 0;
        int x = 0;
        int y = 0;
        for(int i = 0; i < 9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++){
                iarr[i][j] = Integer.parseInt(st.nextToken());
                if(iarr[i][j] > max){
                    max = iarr[i][j];
                    x  = i + 1;
                    y = j + 1;
                } else if(max == 0) {
                    x = 1;
                    y = 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(x + " " + y);

    }
}
