package com.macacolabs.ctest.greedy.ex4;
// https://www.acmicpc.net/problem/1541

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        String[] arr = input.split("-");
        int result = 0;

        for(int i = 0; i < arr.length; i++) {

            String[] temp = arr[i].split("\\+");
            int sum = 0;

            for(int j = 0; j < temp.length; j++) {
                sum += Integer.parseInt(temp[j]);
            }

            if(i == 0) {
                result += sum;
            } else {
                result -= sum;
            }
        }

        System.out.println(result);
    }
}
