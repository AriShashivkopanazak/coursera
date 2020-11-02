import java.util.*;
import java.io.*;

public class MaxPairWise {
    static int getMaxPairwiseProductNow(int[] numbers) {
        int max_product = 0;
        int n = numbers.length;

        for (int first = 0; first < n; ++first) {
            for (int second = first + 1; second < n; ++second) {
                max_product = Math.max(max_product,
                    numbers[first] * numbers[second]);
            }
        }

        return max_product;
    }

    static int getMaxPairwiseProduct(int[] numbers) {
        int max_product =  0;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        
        int index = 0;
        while(index < numbers.length) {
            if (first < numbers[index] ) {
                first = numbers[index];
            }
            index++;
        }
        
        while(index < numbers.length) {
            if (first >= second && second < numbers[index] ) {
                second = numbers[index];
            }
        }

        max_product = first * second;

        return max_product;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                    InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}