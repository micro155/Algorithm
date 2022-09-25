package baekjoon_bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ4458_첫글자를대문자로_220925 {

    private static int N;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        String str[] = new String[N];

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            char c = input.charAt(0);

            if (c >= 'a' && c <= 'z') {
                int gap = c - 'a';
                c = (char) ('A' + gap);
                String changeStr = String.valueOf(c);
                String addStr = input.substring(1);
                str[i] = changeStr + addStr;
            } else {
                str[i] = input;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.println(str[i]);
        }

    }
}
