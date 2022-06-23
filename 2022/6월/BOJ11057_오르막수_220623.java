package algorithm_220623;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ11057_오르막수_220623 {


    private static int N;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        int dp[][] = new int[N + 1][10];

        for (int i = 0; i < 10; i++) {
            dp[1][i] = 1;
        }

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = j; k < 10; k++) {
                    dp[i + 1][k] = (dp[i + 1][k] + dp[i][j]) % 10007;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += (dp[N][i] % 10007);
        }
        System.out.println(sum % 10007);
    }
}
