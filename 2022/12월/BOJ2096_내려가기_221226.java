package algorithm_221226;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2096_내려가기_221226 {

    private static int N, max[], min[];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        max = new int[3];
        min = new int[3];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int x3 = Integer.parseInt(st.nextToken());

            if (i == 0) {
                max[0] = min[0] = x1;
                max[1] = min[1] = x2;
                max[2] = min[2] = x3;
            } else {

                int beforeMaxDp0 = max[0];
                int beforeMaxDp2 = max[2];

                max[0] = Math.max(max[0], max[1]) + x1;
                max[2] = Math.max(max[1], max[2]) + x3;
                max[1] = Math.max(Math.max(beforeMaxDp0, max[1]), beforeMaxDp2) + x2;

                int beforeMinDp0 = min[0];
                int beforeMinDp2 = min[2];

                min[0] = Math.min(min[0], min[1]) + x1;
                min[2] = Math.min(min[1], min[2]) + x3;
                min[1] = Math.min(Math.min(beforeMinDp0, min[1]), beforeMinDp2) + x2;
            }
        }

        int result_max = Math.max(max[0], Math.max(max[1], max[2]));
        int result_min = Math.min(min[0], Math.min(min[1], min[2]));

        StringBuilder sb = new StringBuilder();
        sb.append(result_max).append(" ").append(result_min);
        System.out.println(sb);
    }
}
