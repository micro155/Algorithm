package algorithm_220615;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11055_가장큰증가부분수열_220615 {

    private static int N;
    private static int arr[];
    private static int dp[];


    private static int recur(int num) {

        if (dp[num] == 0) {
            dp[num] = arr[num];

            for (int i = num - 1; i >= 1; i--) {
                if (arr[i] < arr[num]) {
                    dp[num] = Math.max(recur(i) + arr[num], dp[num]);
                } else {
                    recur(i);
                }
            }
        }
        return dp[num];
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[N + 1];
        dp = new int[N + 1];
        int max = 0;

        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[1] = arr[1];
        recur(N);

        for (int i = 1; i <= N; i++) {
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}
