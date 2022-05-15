package algorithm_220515;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ1358_하키_220515 {

    private static int W, H, X, Y, P;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        W = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());

        int result = 0;

        for (int i = 0; i < P; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if ((x - X) * (x - X) + (y - (Y + H / 2)) * (y - (Y + H / 2)) <= (H / 2) * (H / 2) && x < X) {
                result++;
            } else if ((x - (X + W)) * (x - (X + W)) + (y - (Y + H / 2)) * (y - (Y + H / 2)) <= (H / 2) * (H / 2) && X + W < x) {
                result++;
            } else if (X <= x && x <= X + W && Y <= y && y <= Y + H) {
                result++;
            }
        }

        System.out.println(result);


    }
}
