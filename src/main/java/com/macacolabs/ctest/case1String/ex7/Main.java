package com.macacolabs.ctest.case1String.ex7;
//https://www.acmicpc.net/problem/1152

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* stringTokenizer는 기본적으로 문자열을 주어진 구분자(" ", 공백)로 토큰(단어)을 분리할 때 연속된 구분자나
* 문자열의 양 끝에 있는 공백을 하나의 토큰으로 인식하지 않고 무시
* */
public class Main {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            System.out.println(st.countTokens());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}