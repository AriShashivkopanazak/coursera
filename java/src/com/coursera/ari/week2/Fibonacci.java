package com.coursera.ari.week2;

import java.util.Scanner;

public class Fibonacci {
  private static long calc_fib(int n) {

      long[] fibArray = new long[46];
      fibArray[0] = 0;
      fibArray[1] = 1;
      fibArray[2] = 1;

      int index = 2;

      if (n > 2) {
          while (index < n + 1) {
              fibArray[index] = fibArray[index - 2] + fibArray[index - 1];
              index++;
          }
      }
      return fibArray[n];
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(calc_fib(n));
  }
}
