package com.coursera.ari.week3;

import java.util.Scanner;

public class Change {
    private static int getChange(int m) {
        int minNum = 0;
        while (m != 0) {
            if (m - 10 >= 0) {
                m -= 10;
                minNum++;
            } else if (m - 5 >= 0) {
                m -= 5;
                minNum++;
            } else {
                m -= 1;
                minNum++;
            }
        }
        return minNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));
    }
}

