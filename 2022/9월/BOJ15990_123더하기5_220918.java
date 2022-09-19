package algorithm_220918;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ15990_123더하기5_220918 {

    private static int T;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());

        long dp[][] = new long[100_001][4];

        dp[1][1] = 1;
        dp[2][2] = 1;
        dp[3][1] = 1;
        dp[3][2] = 1;
        dp[3][3] = 1;

        for (int i = 4; i <= 100_000; i++) {
            dp[i][1] = (dp[i - 1][2] + dp[i - 1][3]) % 1_000_000_009;
            dp[i][2] = (dp[i - 2][1] + dp[i - 2][3]) % 1_000_000_009;
            dp[i][3] = (dp[i - 3][1] + dp[i - 3][2]) % 1_000_000_009;
        }

        for (int tc = 0; tc < T; tc++) {
            int num = Integer.parseInt(br.readLine());

            StringBuilder sb = new StringBuilder();
            sb.append((dp[num][1] + dp[num][2] + dp[num][3]) % 1000000009);

            System.out.println(sb);
        }


    }
}
