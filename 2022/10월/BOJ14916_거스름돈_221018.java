package algorithm_221018;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ14916_거스름돈_221018 {

    private static int N;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        int dp[] = new int[N + 1];

        if (N < 2) {
            System.out.println(-1);
            return;
        } else {
            if (N == 2) {
                System.out.println(1);
                return;
            } else if (N == 3) {
                System.out.println(-1);
                return;
            } else if (N == 4) {
                System.out.println(2);
                return;
            } else if (N == 5) {
                System.out.println(1);
                return;
            } else {
                dp[2] = 1;
                dp[4] = 2;
                dp[5] = 1;
                for (int i = 6; i <= N; i++) {
                    if (i % 5 == 0) {
                        dp[i] = i / 5;
                    } else {
                        dp[i] = dp[i - 2] + 1;
                    }
                }
            }
        }

        System.out.println(dp[N]);
    }
}
