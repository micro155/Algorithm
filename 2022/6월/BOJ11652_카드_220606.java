package algorithm_220606;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ11652_카드_220606 {

    private static int N;
    private static long arr[];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new long[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(br.readLine());
        }

        Arrays.sort(arr);

        int cnt = 1;
        int max = 1;
        int maxIdx = 0;

        for (int i = 1; i < N; i++) {
            if (arr[i] == arr[i - 1]) {
                cnt++;
            } else {
                cnt = 1;
            }

            if (cnt > max) {
                max = cnt;
                maxIdx = i;
            }
        }

        System.out.println(arr[maxIdx]);
    }
}
