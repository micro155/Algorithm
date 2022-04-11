package algorithm_220411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1712_손익분기점_220411 {

    private static int A, B, C;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        long cnt = 1;

        while (true) {

            if (B >= C) {
                cnt = -1;
                break;
            }
            if (A + (B * cnt) < C * cnt) {
                break;
            }
            cnt++;
        }

        System.out.println(cnt);
    }
}
