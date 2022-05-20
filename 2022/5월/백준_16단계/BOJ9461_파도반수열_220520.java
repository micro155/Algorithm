package algorithm_220520;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ9461_파도반수열_220520 {

    private static int N;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());

            long d[] = new long[num + 1];

            if (num == 1 || num == 2 || num == 3) {
                sb.append(1).append("\n");
            } else if (num == 4 || num == 5) {
                sb.append(2).append("\n");
            } else {
                d[0] = 0;
                d[1] = 1;
                d[2] = 1;
                d[3] = 1;
                d[4] = 2;
                d[5] = 2;

                for (int j = 6; j <= num; j++) {
                    d[j] = d[j - 1] + d[j - 5];
                }

                sb.append(d[num]).append("\n");
            }
        }

        System.out.println(sb);
    }
}
