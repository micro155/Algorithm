package algorithm_221212;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ19592_장난감경주_221212 {

    private static int T;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < T; tc++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());

            double min = X;
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N - 1; i++) {
                int num = Integer.parseInt(st.nextToken());
                min = Math.min(min, 1.0 * X / num);
            }

            int num = Integer.parseInt(st.nextToken());
            if (min > 1.0 * X / num) {
                System.out.println(0);
                continue;
            }

            int left = 0;
            int right = Y;

            while (left <= right) {
                int mid = (left + right) / 2;
                double booster = 1 + 1.0 * (X - mid) / num;

                if (booster >= min) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            if (left > Y) {
                System.out.println(-1);
            } else {
                System.out.println(left);
            }
        }


    }
}
