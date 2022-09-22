package algorithm_220922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ10826_피보나치수4_220922 {

    private static int N;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        BigInteger dp[] = new BigInteger[N + 1];

        if (N == 0) {
            System.out.println(0);
        } else if (N == 1) {
            System.out.println(1);
        } else {
            dp[0] = BigInteger.ZERO;
            dp[1] = BigInteger.ONE;

            for (int i = 2; i <= N; i++) {
                dp[i] = dp[i - 1].add(dp[i - 2]);
            }

            System.out.println(dp[N]);
        }

    }
}
