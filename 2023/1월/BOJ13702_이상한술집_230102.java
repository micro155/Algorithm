package algorithm_230102;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ13702_이상한술집_230102 {

    private static int N, K, arr[], max;

    private static long binarySearch() {
        long start = 1;
        long end = max;

        while (start <= end) {
            long mid = (start + end) / 2;
            int cnt = 0;

            for (int i = 0; i < N; i++) {
                cnt += arr[i] / mid;
            }

            if (cnt < K) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return end;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        max = Integer.MIN_VALUE;

        arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, arr[i]);
        }

        System.out.println(binarySearch());
    }
}
