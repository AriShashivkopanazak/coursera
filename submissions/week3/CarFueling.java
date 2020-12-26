import java.util.Scanner;

public class CarFueling {
    static int computeMinRefills(int dist, int tank, int[] stops) {
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
