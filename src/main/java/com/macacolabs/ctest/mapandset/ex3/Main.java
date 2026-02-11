package com.macacolabs.ctest.mapandset.ex3;
// https://www.acmicpc.net/problem/7785

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Map<String, String> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String state = st.nextToken();
            if(state.equals("enter")) {
                map.put(name, "enter");
            } else {
                map.remove(name);
            }
        }

        List<String> list = new ArrayList<>(map.keySet());

        Collections.sort(list, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for(String s : list) {
            sb.append(s).append('\n');
        }

        System.out.println(sb);
    }
}
