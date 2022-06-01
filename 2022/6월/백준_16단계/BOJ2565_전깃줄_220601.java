package algorithm_220601;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ2565_전깃줄_220601 {

    private static int N;
    private static int dp[];
    private static int wire[][];

    private static int recursive(int n) {

        if (dp[n] == 0) {

            dp[n] = 1;

            for (int i = n + 1; i < dp.length; i++) {

                if (wire[n][1] < wire[i][1]) {
                    dp[n] = Math.max(dp[n], recursive(i) + 1);
                }
            }
        }
        return dp[n];

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        dp = new int[N];
        wire = new int[N][2];


        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            wire[i][0] = a;
            wire[i][1] = b;
        }

        Arrays.sort(wire, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        int max = 0;

        for (int i = 0; i < N; i++) {
            max = Math.max(max, recursive(i));
        }

        System.out.println(N - max);
    }
}
