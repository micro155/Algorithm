package algorithm_220731;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ20551_Sort마스터배지훈의후계자_220731 {


    private static int N, M, arr[], input[];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        input = new int[M];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(br.readLine());

            int start = 0;
            int end = N - 1;
            int result = -1;

            while (start <= end) {
                int mid = (start + end) / 2;

                if (num > arr[mid]) {
                    start = mid + 1;
                } else if (num < arr[mid]) {
                    end = mid - 1;
                } else {
                    result = mid;
                    end = mid - 1;
                }
            }

            sb.append(result).append('\n');
        }


        System.out.println(sb);

    }
}
