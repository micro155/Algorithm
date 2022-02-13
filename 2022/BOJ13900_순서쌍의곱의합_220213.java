package algorithm_220213;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ13900_순서쌍의곱의합_220213 {


    private static int N;
    private static int arr[];
    private static long sum[];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        sum = new long[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        sum[0] = arr[0];
        for (int i = 1; i < N; i++) {
            sum[i] = sum[i - 1] + arr[i];
        }


        long result = 0;
        for (int i = 0; i < N; i++) {
            result += arr[i] * (sum[N - 1] - sum[i]);
        }


        System.out.println(result);
    }
}
