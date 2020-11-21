import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxPairWise {

    static long getMaxPairwiseProduct(int[] numbers) {
        long max_product;
        long first = 0;
        long second = 0;
        int firstIndex = Integer.MIN_VALUE;

        int i = 0;
        while(i < numbers.length) {
            if (first < numbers[i] ) {
                firstIndex = i;
                first = numbers[i];
            }
            i++;
        }

        int j = 0;
        while(j < numbers.length) {
            if (j != firstIndex && second <= numbers[j] ) {
                second = numbers[j];
            }
            j++;
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

    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(InputStream stream) {
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

        public int nextInt() {
            return Integer.parseInt(next());
        }
    }
}

