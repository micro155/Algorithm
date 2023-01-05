package algorithm_230106;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ17245_서버실_230106 {

    private static int N, arr[][];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        int max = Integer.MIN_VALUE;
        long totalSum = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                totalSum += arr[i][j];
                max = Math.max(max, arr[i][j]);
            }
        }

        int start = 0;
        int end = max;

        while (start + 1 < end) {
            int mid = (start + end) / 2;
            long sum = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    sum += mid > arr[i][j] ? arr[i][j] : mid;
                }
            }

            if (((double) sum / totalSum) >= 0.5) {
                end = mid;
            } else {
                start = mid;
            }
        }

        System.out.println(end);
    }
}
