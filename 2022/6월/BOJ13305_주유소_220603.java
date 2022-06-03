package algorithm_220603;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ13305_주유소_220603 {

    private static int N;
    private static long dis[];
    private static int point[];
    private static long min_sum[];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        dis = new long[N - 1];
        point = new int[N];
        min_sum = new long[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < dis.length; i++) {
            dis[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < point.length; i++) {
            point[i] = Integer.parseInt(st.nextToken());
        }

        int index = 0;
        int min_point = point[0];

        while (index < N) {

            if (index == 0) {
                index++;
                continue;
            }

            min_point = Math.min(min_point, point[index - 1]);

            min_sum[index] = min_sum[index - 1] + (dis[index - 1] * min_point);
            index++;
        }

        System.out.println(min_sum[N - 1]);
    }
}
