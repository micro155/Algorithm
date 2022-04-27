package algorithm_220427;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11051_이항계수2_220427 {

    private static int N, K;
    private static long dp[][];


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        dp = new long[1001][1001];

        dp[0][0] = 1;
        dp[1][0] = 1;
        dp[1][1] = 1;

        for (int i = 2; i <= N; i++) {

            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    dp[i][j] = 1;
                } else if (j == i) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j]) % 10007;
                }
            }
        }

        System.out.println(dp[N][K]);
    }
}
