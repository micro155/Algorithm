package algorithm_220913;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10211_MaximumSubarray_220913 {

    private static int T;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < T; tc++) {
            int N = Integer.parseInt(br.readLine());
            int dp[] = new int[N];
            int arr[] = new int[N];

            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            dp[0] = arr[0];
            int max = arr[0];
            for (int i = 1; i < N; i++) {
                if (dp[i - 1] < 0)
                    dp[i - 1] = 0;
                dp[i] = dp[i - 1] + arr[i];
                max = Math.max(max, dp[i]);
            }

            System.out.println(max);

        }
    }
}
