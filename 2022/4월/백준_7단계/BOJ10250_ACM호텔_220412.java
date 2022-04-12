package algorithm_220412;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10250_ACM호텔_220412 {

    private static int T;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());
        String result[] = new String[T];

        for (int i = 0; i < T; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int cnt = 0;
            int x = 0;
            int y = 1;

            while (cnt < N) {

                if (x < H) {
                    x++;
                } else {
                    x = 1;
                    y++;
                }
                cnt++;
            }

            if (y < 10) {
                result[i] = x + "0" + y;
            } else {
                result[i] = x + "" + y;
            }
        }

        for (int i = 0; i < T; i++) {
            System.out.println(result[i]);
        }


    }
}
