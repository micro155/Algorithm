package algorithm_220514;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1004_어린왕자_220514 {

    private static int T;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());


        for (int tc = 0; tc < T; tc++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int n = Integer.parseInt(br.readLine());

            int result = 0;

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                int c1 = Integer.parseInt(st.nextToken());
                int c2 = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());

                boolean check = false;
                boolean check2 = false;


                if (Math.pow(x1 - c1, 2) + Math.pow(y1 - c2, 2) > Math.pow(r, 2))
                    check = true;
                if (Math.pow(x2 - c1, 2) + Math.pow(y2 - c2, 2) > Math.pow(r, 2))
                    check2 = true;

                if (!check && check2) {
                    result++;
                } else if (check && !check2) {
                    result++;
                }
            }

            System.out.println(result);
        }
    }
}
