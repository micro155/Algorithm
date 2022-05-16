package algorithm_220516;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ3034_앵그리창영_220516 {

    private static int N, H, W;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        int result = 0;
        int max = (int) (Math.pow(W, 2) + Math.pow(H, 2));

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());

            if (Math.pow(num, 2) <= max) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
    }
}
