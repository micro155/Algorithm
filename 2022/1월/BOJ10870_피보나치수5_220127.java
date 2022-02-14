package algorithm_220127;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ10870_피보나치수5_220127 {

    private static int N;

    private static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        System.out.println(fibonacci(N));
    }
}
