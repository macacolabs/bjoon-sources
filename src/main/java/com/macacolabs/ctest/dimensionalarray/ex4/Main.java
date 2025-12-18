package com.macacolabs.ctest.dimensionalarray.ex4;

// https://www.acmicpc.net/problem/2563
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        boolean[][] square = new boolean[101][101];
        int count = 0;
        for(int i = 0; i < N; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for(int j = x; j < x + 10; j++  ) {
                for(int k = y; k < y + 10; k++) {
                    if((!square[j][k])){
                        square[j][k] = true;
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
