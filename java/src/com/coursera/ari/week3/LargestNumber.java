package com.coursera.ari.week3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LargestNumber {
    private static Boolean isGreaterOrEqual(String digit, int maxDigit) {
        String[] currentDigitList = digit.split("");
        String[] currentMaxDigitList = String.valueOf(maxDigit).split("");
        int maxIterations = Math.min(currentDigitList.length, currentMaxDigitList.length);
        for (int i = 0 ; i < maxIterations ; i++) {
            if (Integer.parseInt(currentDigitList[i]) > Integer.parseInt(currentMaxDigitList[i])) {
                return true;
            } else if (Integer.parseInt(currentDigitList[i]) == Integer.parseInt(currentMaxDigitList[i])) {
                return currentDigitList.length <= currentMaxDigitList.length;
            }
        }
        return false;
    }

    private static String largestNumber(String[] digits) {
        StringBuilder result = new StringBuilder();
        List<String> digitList = new LinkedList<>(Arrays.asList(digits));
        while (!digitList.isEmpty()) {
            int maxDigit = 0;
            int maxDigitIndex = 0;
            for (int digit = 0 ; digit < digitList.size() ; digit++) {
                if (isGreaterOrEqual(digitList.get(digit), maxDigit)) {
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

