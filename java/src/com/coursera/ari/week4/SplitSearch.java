package com.coursera.ari.week4;

import java.util.Arrays;

public class SplitSearch {
    private static double[] search() {
        // assign the array length to the number of guesses
        double[] results = new double[21];
        double binaryCount = 2;
        double prev = 0;
        for (int i = 0 ; i < results.length ; i++) {
            // put your number in question here
            results[i] = (2097151 / binaryCount) + prev;
            results[i] = Math.round(results[i]);
            prev = results[i];
            binaryCount *= 2;
        }
        return results;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(search()));
    }
}
