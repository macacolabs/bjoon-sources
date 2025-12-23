package com.macacolabs.ctest.forloop.ex14;
// https://www.acmicpc.net/problem/25206

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double totlaCredit = 0.0;
        double totalScore = 0.0;
        for(int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String subject = st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if(grade.equals("P")) continue;

            switch (grade) {
                case "A+": totalScore += credit * 4.5; break;
                case "A0": totalScore += credit * 4.0; break;
                case "B+": totalScore += credit * 3.5; break;
                case "B0": totalScore += credit * 3.0; break;
                case "C+": totalScore += credit * 2.5; break;
                case "C0": totalScore += credit * 2.0; break;
                case "D+": totalScore += credit * 1.5; break;
                case "D0": totalScore += credit * 1.0; break;
                case "F": totalScore += credit * 0.0; break;
            }
            totlaCredit += credit;
        }

        System.out.printf("%.6f\n", totalScore / totlaCredit);
    }
}
