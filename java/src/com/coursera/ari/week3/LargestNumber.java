package com.coursera.ari.week3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class LargestNumber {
    private static String largestNumber(String[] digits) {
        StringBuilder result = new StringBuilder();
        List<String> digitList = new LinkedList<>(Arrays.asList(digits));
        while (!digitList.isEmpty()) {
            int maxDigit = Integer.MIN_VALUE;
            int maxDigitIndex = 0;
            for (int digit = 0 ; digit < digitList.size() ; digit++) {
                if (Integer.parseInt(digitList.get(digit)) >= maxDigit) {
                    maxDigit = Integer.parseInt(digitList.get(digit));
                    maxDigitIndex = digit;
                }
            }
            result.append(maxDigit);
            digitList.remove(maxDigitIndex);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.next();
        }
        System.out.println(largestNumber(a));
    }
}

