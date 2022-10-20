package algorithm_221020;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2491_수열_221020 {

    private static int N;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        int max = 0;

        if (N == 1) {
            System.out.println(1);
            return;
        }

        for (int i = 1; i < N; i++) {
            if (arr[i - 1] <= arr[i]) {
                if (cnt == 0) {
                    cnt = 1;
                }
                cnt++;
                max = Math.max(max, cnt);
            } else {
                cnt = 0;
            }
        }

        int cnt2 = 0;
        for (int i = 1; i < N; i++) {
            if (arr[i - 1] >= arr[i]) {
                if (cnt2 == 0) {
                    cnt2 = 1;
                }
                cnt2++;
                max = Math.max(max, cnt2);
            } else {
                cnt2 = 0;
            }
        }

        System.out.println(max);
    }
}
