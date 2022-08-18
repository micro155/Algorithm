package algorithm_220818;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ19637_IF문좀대신써줘_220818 {


    private static int N, M, thresholds[];
    private static String names[];

    private static class Power {
        private int threshold[];
        private int left, right, mid;

        Power(int[] threshold) {
            this.threshold = threshold;
        }

        int power(int p) {
            left = 0;
            right = threshold.length - 1;
            mid = right;
            while (right - left > 1) {
                mid = (right + left) / 2;
                if (threshold[mid] >= p) {
                    right = mid;
                } else {
                    left = mid;
                }
            }
            if (threshold[left] == threshold[right])
                return left;
            return right;
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        thresholds = new int[N + 1];
        names = new String[N + 1];

        thresholds[0] = -1;

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            names[i] = st.nextToken();
            thresholds[i] = Integer.parseInt(st.nextToken());
        }

        Power p = new Power(thresholds);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            String name = names[p.power(Integer.parseInt(br.readLine()))];
            sb.append(name).append('\n');
        }

        System.out.println(sb);
    }
}
