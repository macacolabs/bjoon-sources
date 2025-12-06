package com.macacolabs.ctest.conditionalStatement.ex4;

//https://www.acmicpc.net/problem/14681

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            int x = Integer.parseInt(br.readLine());
            int y = Integer.parseInt(br.readLine());

            int quadrant = 0;

            if((x > 0) && (y > 0)){
                quadrant = 1;
            } else if((x < 0) && (y > 0)) {
                quadrant = 2;
            } else if((x < 0) && (y < 0)) {
                quadrant = 3;
            } else {
                quadrant = 4;
            }
            System.out.println(quadrant);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
