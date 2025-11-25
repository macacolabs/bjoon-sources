package com.macacolabs.ctest.array.ex1;

//https://www.acmicpc.net/problem/10807
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int num = Integer.parseInt(br.readLine());

            int[] arr = new int[num];

            String str = br.readLine();
            String[] sArr = str.split(" ");
            String findStr = br.readLine();
            int result = 0;
            for(int i = 0; i < sArr.length; i++){
                if(sArr[i].equals(findStr)){
                    result++;
                }
            }
            System.out.println(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
