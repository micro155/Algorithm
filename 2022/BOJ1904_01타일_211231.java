package algorithm_1231;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ1904_01타일_211231 {

    private static int N;
    private static int dp[];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        dp = new int[N + 1];

        if (N == 1) {
            System.out.println(1);
        } else if (N == 2) {
            System.out.println(2);
        } else {
            dp[1] = 1;
            dp[2] = 2;

            for (int i = 3; i <= N; i++) {
                dp[i] = (dp[i - 1] + dp[i - 2]) % 15746;
            }

            System.out.println(dp[N]);
        }

    }
}
