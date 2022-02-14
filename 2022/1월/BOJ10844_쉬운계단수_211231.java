package algorithm_1231;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ10844_쉬운계단수_211231 {

    private static int N;
    private static long dp[][];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        dp = new long[101][11];

        for (int i = 1; i <= 9; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= N; i++) {
            dp[i][0] = dp[i - 1][1];
            for (int j = 1; j <= 9; j++) {
                dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % 1000000000;
            }
        }

        long sum = 0;
        for (int i = 0; i < 10; i++)
            sum += dp[N][i];

        System.out.println(sum % 1000000000);

    }
}
