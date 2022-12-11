package algorithm_221211;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1590_캠프가는영식_221211 {

    private static int N, T;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());

        int min = Integer.MAX_VALUE;

        for (int n = 0; n < N; n++) {
            st = new StringTokenizer(br.readLine());

            int s = Integer.parseInt(st.nextToken());
            int i = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            while (s < T && --c > 0 && min > s) {
                s += i;
            }

            if (s >= T)
            min = Math.min(min, s);
        }

        System.out.println(min == Integer.MAX_VALUE ? -1 : min - T);
    }
}
