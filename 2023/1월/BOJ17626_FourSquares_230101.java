package algorithm_230101;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ17626_FourSquares_230101 {

    private static int N, dp[];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        dp = new int[N + 1];

        dp[1] = 1;

        for (int i = 2; i <= N; i++) {
            int min = Integer.MAX_VALUE;

            for (int j = 1; j * j <= i; j++) {
                int num = i - j * j;
                min = Math.min(min, dp[num]);
            }

            dp[i] = min + 1;
        }

        System.out.println(dp[N]);
    }
}
