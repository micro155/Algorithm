package algorithm_220311;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ21758_꿀따기_220311 {

    private static int N;
    private static int arr[];
    private static long sum[];


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N + 1];
        sum = new long[N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum[i] = arr[i] + sum[i - 1];
        }

        long result = 0;

        for (int i = 2; i < N; i++) {
            result = Math.max(result, sum[N] - arr[1] - arr[i] + sum[N] - sum[i]);
        }
        for (int i = 2; i < N; i++) {
            result = Math.max(result, sum[N] - arr[N] - arr[i] + sum[i - 1]);
        }
        for (int i = 2; i < N; i++) {
            result = Math.max(result, sum[i] - arr[1] + sum[N] - sum[i - 1] - arr[N]);
        }

        System.out.println(result);
    }
}
