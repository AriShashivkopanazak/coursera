import java.util.*;

public class FibonacciSumLastDigit {
    private static long getFibonacciSum(long n) {

        // The first two Fibonacci numbers
        int f0 = 0;
        int f1 = 1;

        // Base case
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        else {

            // Pisano period for % 10 is 60
            int rem = (int) (n % 60);

            // Checking the remainder
            if (rem == 0)
                return 0;

            // The loop will range from 2 to
            // two terms after the remainder
            for (int i = 2; i < rem + 3; i++) {
                int f = (f0 + f1) % 60;
                f0 = f1;
                f1 = f;
            }

            return (f1 - 1) % 10;
        }
//        long[] fibArray = new long[(int) (n + 1)];
//        if (n == 0) {
//            return 0;
//        } else if (n == 1) {
//            return 1;
//        }
//        fibArray[0] = 0;
//        fibArray[1] = 1;
//        fibArray[2] = 1;
//        int count = 0;
//
//        int index = 2;
//
//        if (n > 2) {
//            while (index < n + 1) {
//                fibArray[index] = fibArray[index - 2] + fibArray[index - 1] % 10;
//                index++;
//            }
//        }
//
//        for (long i : fibArray) {
//          count += i;
//          count = count % 10;
//        }
//
//        return count;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long s = getFibonacciSum(n);
        System.out.println(s);
    }
}

