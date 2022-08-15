package algorithm_220815;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ9656_돌게임2_220815 {

    private static int N, dp[];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        dp = new int[N + 1];

        if (N > 3) {
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 1;

            for (int i = 4; i <= N; i++) {
                dp[i] = Math.min(dp[i - 1], dp[i - 3]) + 1;
            }

            if (dp[N] % 2 == 0) {
                System.out.println("SK");
            } else {
                System.out.println("CY");
            }
        } else if (N == 1)  {
            System.out.println("CY");
        } else if (N == 2) {
            System.out.println("SK");
        } else {
            System.out.println("CY");
        }


    }

}
