package algorithm_220627;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ2294_동전2_220627 {


    private static int N, K;
    private static int arr[];
    private static int dp[];


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new int[N + 1];
        dp = new int[K + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 1; i <= K; i++) {
            dp[i] = Integer.MAX_VALUE - 1;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = arr[i]; j <= K; j++) {
                dp[j] = Math.min(dp[j], dp[j - arr[i]] + 1);
            }
        }

        if (dp[K] == Integer.MAX_VALUE - 1) {
            System.out.println(-1);
        } else {
            System.out.println(dp[K]);
        }
    }
}
