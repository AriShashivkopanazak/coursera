package com.coursera.ari;

import com.coursera.ari.week1.MaxPairWise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int getMaxPairwiseProduct(int[] numbers) {
        int max_product =  0;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        int i = 0;
        while(i < numbers.length) {
            if (first <= numbers[i] ) {
                first = numbers[i];
            } else {
                break;
            }
            i++;
        }


        int j = 0;
        while(j < numbers.length) {
            if (second != numbers[i] && second <= numbers[j] ) {
                second = numbers[j];

            }
            j++;
        }

        max_product = first * second;

        return max_product;
    }

    public static void main(String[] args) {
        MaxPairWise.FastScanner scanner = new MaxPairWise.FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                        InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
