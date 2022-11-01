package algorithm_221101;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2745_진법변환_221101 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String input = st.nextToken();
        int num = Integer.parseInt(st.nextToken());

        int tmp = 1;
        int ans = 0;

        for (int i = input.length() - 1; i >= 0; i--) {
            char c = input.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                ans += (c - 'A' + 10) * tmp;
            } else {
                ans += (c - '0') * tmp;
            }
            tmp *= num;
        }

        System.out.println(ans);
    }
}
