package algorithm_221025;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1817_짐챙기는숌_221025 {

    private static int N, M;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        if (N != 0) {
            int nums[] = new int[N];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                nums[i] = Integer.parseInt(st.nextToken());
            }

            int sum = 0;
            int cnt = 1;
            for (int i = 0; i < N; i++) {
                if (sum + nums[i] <= M) {
                    sum += nums[i];
                } else {
                    cnt++;
                    sum = nums[i];
                }
            }
            System.out.println(cnt);
        } else {
            System.out.println(0);
        }
    }
}
