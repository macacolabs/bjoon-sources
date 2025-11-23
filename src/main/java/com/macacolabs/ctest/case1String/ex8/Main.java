package com.macacolabs.ctest.case1String.ex8;

// https://www.acmicpc.net/problem/2908
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
//            String str = br.readLine();
//            StringTokenizer st = new StringTokenizer(str);
//            String num1 = st.nextToken();
//            String reverseNum1 = "";
//            for(int i = num1.length() - 1; i >= 0; i--) {
//                reverseNum1 += num1.charAt(i);
//            }
//            String num2 = st.nextToken();
//            String reverseNum2 = "";
//            for(int i = num2.length() - 1; i >= 0; i--) {
//                reverseNum2 += num2.charAt(i);
//            }
//
//            int checkNum = Integer.parseInt(reverseNum1);
//            int checkNum2 = Integer.parseInt(reverseNum2);
//            if(checkNum > checkNum2) {
//                System.out.println(checkNum);
//            } else {
//                System.out.println(checkNum2);
//            }
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int num1 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString()) ;
            int num2 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString()) ;

            System.out.println(num1 > num2 ? num1 : num2);



        } catch (IOException e) {
            throw new RuntimeException(e); }
    }
}
