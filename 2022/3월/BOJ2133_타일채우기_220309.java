package algorithm_220309;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2133_타일채우기_220309 {

    private static int N;
    private static int dp[];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        dp = new int[N + 1];

        if (N % 2 == 1) {
            System.out.println(0);
        } else {
            dp[0] = 1;
            dp[1] = 0;
            dp[2] = 3;

            for (int i = 4; i <= N; i += 2) {
                dp[i] = dp[i - 2] * dp[2];
                for (int j = i - 4; j >= 0; j -= 2) {
                    dp[i] = dp[i] + (dp[j] * 2);
                }
            }
            System.out.println(dp[N]);
        }


    }
}
