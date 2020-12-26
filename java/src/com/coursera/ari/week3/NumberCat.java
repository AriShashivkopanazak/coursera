package com.coursera.ari.week3;

import java.util.*;

public class NumberCat {
    private static boolean check(String digit, int maxDigit) {
        String[] digitList = digit.split("");
        String[] maxList = String.valueOf(maxDigit).split("");
        int maxIterations = Math.min(digitList.length, maxList.length);
        for (int currentDigit = 0 ; currentDigit < maxIterations ; currentDigit++) {
            if (Integer.parseInt(digitList[currentDigit]) > Integer.parseInt(maxList[currentDigit])) {
                return true;
            } else if (Integer.parseInt(digitList[currentDigit]) == Integer.parseInt(maxList[currentDigit]) || digitList.length <= maxList.length) {
                return true;
            }
        }
        return false;
    }

    private static String concatenate(String[] a) {
        StringBuilder result = new StringBuilder();
        List<String> digits= new LinkedList<>(Arrays.asList(a));
        while (!digits.isEmpty()) {
            int maxDigit = 0;
            int maxDigitIndex = 0;
            for (int digit = 0 ; digit < digits.size() ; digit++) {
                if (check(digits.get(digit), maxDigit)) {
                    maxDigit = Integer.parseInt(digits.get(digit));
                    maxDigitIndex = digit;
                }
            }
            result.append(maxDigit);
            digits.remove(maxDigitIndex);
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
        System.out.println(concatenate(a));
    }
}
