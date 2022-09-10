package algorithm_220910;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1166_선물_220910 {

    private static int N, L, W, H;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        double min = 0;
        double max = Math.max(L, Math.max(W, H));

        for (int i = 0; i < 10000; i++) {

            double mid = (min + max) / 2;

            if ((long) (L / mid) * (long) (W / mid) * (long) (H / mid) >= N)
                min = mid;
            else
                max = mid;
        }

        System.out.println(min);
    }
}
