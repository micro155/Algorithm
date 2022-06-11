package algorithm_220610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ17266_어두운굴다리_220611 {

    private static int N, M;
    private static int arr[];

    private static boolean possible(int target) {

        int prev = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] - target <= prev) {
                prev = arr[i] + target;
            } else {
                return false;
            }
        }

        return N - prev <= 0;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        arr = new int[M];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int start = 1;
        int end = N;
        int result = 0;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (possible(mid)) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.println(result);
    }
}
