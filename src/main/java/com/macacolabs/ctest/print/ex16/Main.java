package com.macacolabs.ctest.print.ex16;
// https://www.acmicpc.net/problem/2941

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String[] croatian = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String s : croatian) {
            if (str.contains(s)) {
                str = str.replace(s, "*");
            }
        }

        System.out.println(str.length());
    }
}
