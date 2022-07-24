package algorithm_220724;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ2512_예산_220724 {

    private static int N, arr[];
    private static long M, result;

    private static void binarySearch(long start, long end) {

        if (start > end) {
            return;
        }

        long mid = (start + end) / 2;

        long sum = 0;
        for (int i = 0; i < N; i++) {

            if (arr[i] >= mid) {
                sum += mid;
            } else {
                sum += arr[i];
            }
        }

        if (sum <= M) {
            result = Math.max(result, mid);
            binarySearch(mid + 1, end);
        } else {
            binarySearch(start, mid - 1);
        }


    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        M = Long.parseLong(br.readLine());

        Arrays.sort(arr);

        binarySearch(0, arr[N - 1]);

        System.out.println(result);

    }
}
