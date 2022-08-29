package algorithm_220829;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ16395_파스칼의삼각형_220829 {

    private static int N, K, dp[][];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        dp = new int[N + 1][N + 1];

        for (int i = 0; i <= N; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }

        System.out.println(dp[N - 1][K - 1]);
    }
}
