package algorithm_220323;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1120_문자열_220323 {

    private static String a, b;
    private static int result = 50;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        a = st.nextToken();
        b = st.nextToken();

        for (int i = 0; i <= b.length() - a.length(); i++) {
            int cnt = 0;
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) != b.charAt(j + i)) {
                    cnt++;
                }
            }
            result = Math.min(result, cnt);
        }

        System.out.println(result);

    }
}
