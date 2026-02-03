package com.macacolabs.ctest.sorting.ex6;
// https://www.acmicpc.net/problem/1427

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int[] iarr = new int[str.length()];

        for(int j = 0; j < str.length(); j++){
            iarr[j] = str.charAt(j) - '0';
        }

        Arrays.sort(iarr);

        StringBuilder sb = new StringBuilder();
        for(int j = iarr.length - 1; j >= 0; j--){
            sb.append(iarr[j]);
        }
        System.out.println(sb);
    }
}
