package com.coursera.ari.week3;

import java.util.*;
import java.util.stream.Collectors;

public class CarFueling {
    static int computeMinRefillsOld(int dist, int tank, int[] stops) {
        // answer
        int numRefills = 0;
        // stores distance of the last stop
        int previousStop = 0;
        // initialize at current tank
        int currentTank = tank;
        int stopVar = 0;
        while (!(currentTank >= dist)) {
            for (int stop : stops) {
                if (stop <= currentTank) {
                    previousStop = stop;
                    stopVar = stop;
                } else {
                    break;
                }
            }
            currentTank = previousStop + tank;
            if (currentTank < stopVar || currentTank < dist) {
                return -1;
            }
            numRefills++;
        }

        return numRefills;
    }

    static int computeMinRefills(int dist, int tank, int[] stops) {
        List<Integer> stopList = Arrays.stream(stops).boxed().collect(Collectors.toList());

        int numRefills = 0;
        int currentRefill = tank;
        while (currentRefill < dist) {
           for (int stop : stopList) {
               if (!(stop <= currentRefill)) {
                   numRefills++;
                   break;
               }
           }
            //currentRefill = stop + tank;

        }


        return numRefills;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dist = scanner.nextInt();
        int tank = scanner.nextInt();
        int n = scanner.nextInt();
        int[] stops = new int[n];
        for (int i = 0; i < n; i++) {
            stops[i] = scanner.nextInt();
        }

        System.out.println(computeMinRefills(dist, tank, stops));
    }
}
