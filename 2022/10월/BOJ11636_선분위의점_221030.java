package algorithm_221030;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ11636_선분위의점_221030 {

    private static int N, M;
    private static int arr[];

    private static int binary(int start, int end) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] > end) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        int endIdx = right + 1;

        left = 0;
        right = arr.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] < start) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        int startIdx = left;

        return endIdx - startIdx;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            int count = binary(start, end);
            sb.append(count).append('\n');
        }

        System.out.println(sb);
    }
}
