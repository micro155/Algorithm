package algorithm_221117;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ12018_YonseiTOTO_221117 {

    private static int N, M;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int min_arr[] = new int[N];

        for (int t = 0; t < N; t++) {

            st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            Integer arr[] = new Integer[A];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < A; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr, Collections.reverseOrder());

            if (A >= B) {
                min_arr[t] = arr[B - 1];
            } else {
                min_arr[t] = 1;
            }
        }

        Arrays.sort(min_arr);

        int sum = 0;
        int cnt = 0;

        for (int i = 0; i < min_arr.length; i++) {
            sum += min_arr[i];
            if (sum <= M) {
                cnt++;
            } else {
                break;
            }
        }

        System.out.println(cnt);
    }
}
