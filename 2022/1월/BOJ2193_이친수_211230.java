package algorithm_1230;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2193_이친수_211230 {

    private static int N;
    private static long dp[];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        dp = new long[N + 1];

        if (N == 1) {
            System.out.println(1);
        } else if (N == 2) {
            System.out.println(1);
        } else {
            dp[0] = 0;
            dp[1] = 1;
            dp[2] = 1;

            for (int i = 3; i <= N; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }

            System.out.println(dp[N]);

        }

    }

}
