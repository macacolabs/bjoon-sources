package com.macacolabs.ctest.recursion.ex4;
// https://www.acmicpc.net/problem/24060

import java.io.*;
import java.util.*;

public class Main {
    static int[] temp;
    static int K;
    static int count = 0;
    static int result = -1;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        temp = new int[N];

        mergeSort(arr, 0, N - 1);

        System.out.println(result);
    }


    public static void mergeSort(int[] A, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(A, p, q);
            mergeSort(A, q + 1, r);
            merge(A, p, q, r);
        }
    }

    public static void merge(int[] A, int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int t = 0;

        while (i <= q && j <= r) {
            if (A[i] <= A[j]) temp[t++] = A[i++];
            else temp[t++] = A[j++];
        }

        while (i <= q) temp[t++] = A[i++];
        while (j <= r) temp[t++] = A[j++];


        i = p; t = 0;
        while (i <= r) {
            count++;
            if (count == K) {
                result = temp[t];
            }
            A[i++] = temp[t++];
        }
    }
}
