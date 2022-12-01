package algorithm_221201;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14627_파닭파닭_221201 {

    private static int S, C;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        S = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        int start = 1;
        int end = 1_000_000_000;
        long sum = 0;
        int arr[] = new int[S];

        for (int i = 0; i < S; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        while (start <= end) {
            int mid = (start + end) / 2;
            int cnt = 0;

            for (int i = 0; i < S; i++) {
                cnt += arr[i] / mid;
            }

            if (cnt >= C) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(sum - end * (long) C);

    }
}
