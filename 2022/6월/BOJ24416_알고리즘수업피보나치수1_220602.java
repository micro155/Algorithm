package algorithm_220602;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ24416_알고리즘수업피보나치수1_220602 {


    private static int N;
    private static int dp[];
    private static int A, B;


    private static int fib(int n) {
        if (n == 1 || n == 2) {
            A++;
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    private static int fibonacci(int n) {

        dp[1] = 1;
        dp[2] = 1;

        for (int i = 3; i <= n; i++) {
            B++;
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        dp = new int[41];
        fib(N);
        fibonacci(N);


        System.out.print(A + " " + B);
    }
}
