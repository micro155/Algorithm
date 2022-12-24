package algorithm_221224;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2670_연속부분최대곱_221224 {

    private static int N;
    private static double arr[], dp[];

    private static double result() {

        double max = 0;
        for (int i = 1; i <= N; i++) {
            dp[i] = Math.max(arr[i], dp[i - 1] * arr[i]);
            max = Math.max(max, dp[i]);
        }

        return max;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new double[N + 1];
        dp = new double[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }

        double ans = result();

        System.out.println(String.format("%.3f", ans));
    }
}
