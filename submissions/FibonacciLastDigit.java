import java.util.*;

public class FibonacciLastDigit {
    private static long getFibonacciLastDigit(int n) {
        long[] fibArray = new long[(int) n + 1];
        fibArray[0] = 0;
        fibArray[1] = 1;
        fibArray[2] = 1;

        int index = 2;

        if (n > 2) {
            while (index < n + 1) {
                fibArray[index] = (fibArray[index - 2] + fibArray[index - 1]) % 10;
                index++;
            }
        }
        return fibArray[n];
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long c = getFibonacciLastDigit(n);
        System.out.println(c);
    }
}

