package algorithm_221211;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ12782_비트우정지수_221211 {

    private static int T;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String input1 = st.nextToken();
            String input2 = st.nextToken();

            int diff = 0, cnt1 = 0, cnt2 = 0;

            for (int i = 0; i < input1.length(); i++) {
                char c1 = input1.charAt(i);
                char c2 = input2.charAt(i);

                if (c1 == '1') {
                    cnt1++;
                }
                if (c2 == '1') {
                    cnt2++;
                }
                if (c1 != c2) {
                    diff++;
                }
            }

            int dist = Math.abs(cnt1 - cnt2);
            int result = 0;

            if (dist == 0) {
                result = diff / 2;
            } else {
                result = ((diff - dist) / 2) + dist;
            }

            System.out.println(result);
        }
    }
}
