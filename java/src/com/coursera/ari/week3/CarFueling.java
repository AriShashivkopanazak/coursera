package com.coursera.ari.week3;

import java.util.Scanner;

public class CarFueling {
    static int computeMinRefills(int dist, int tank, int[] stops) {
        int numRefills = 0;
        int currentRefill = 0;

        while (currentRefill <= dist) {

            int lastRefill = currentRefill;
            while (currentRefill <= dist && stops[currentRefill + 1] - stops[lastRefill] <= tank) {
                currentRefill = currentRefill + 1;
            }
            if (currentRefill == lastRefill) {
                return -1;
            } else if (currentRefill <= dist) {
                numRefills++;
            }
        }
        return numRefills;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dist = scanner.nextInt();
        int tank = scanner.nextInt();
        int n = scanner.nextInt();
        int stops[] = new int[n];
        for (int i = 0; i < n; i++) {
            stops[i] = scanner.nextInt();
        }

        System.out.println(computeMinRefills(dist, tank, stops));
    }
}
