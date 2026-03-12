package com.macacolabs.ctest.recursion.ex1;
// https://www.acmicpc.net/problem/27433

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(factorial(N));

    }

    public static long factorial(int n) {
        if(n <= 1) return 1;

        return n * factorial(n - 1);
    }
}
