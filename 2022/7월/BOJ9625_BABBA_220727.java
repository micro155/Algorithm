package algorithm_220727;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ9625_BABBA_220727 {

    private static int N, dp[][];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        dp = new int[2][46];

        dp[0][2] = 1;
        dp[1][1] = 1;
        dp[1][2] = 1;

        for (int i = 3; i <= N; i++) {
            dp[0][i] = dp[0][i - 2] + dp[0][i - 1];
            dp[1][i] = dp[1][i - 2] + dp[1][i - 1];
        }

        System.out.println(dp[0][N] + " " + dp[1][N]);
    }
}
