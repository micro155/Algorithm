package algorithm_220407;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ1110_더하기사이클_220407 {

    private static int N;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        int num = N;
        int cnt = 0;
        while (true) {

            String input = String.valueOf(num);
            int sum = 0;
            for (int i = 0; i < input.length(); i++) {
                sum += Integer.parseInt(String.valueOf(input.charAt(i)));
            }

            String sum_str = String.valueOf(sum);

            num = Integer.parseInt(String.valueOf(input.charAt(input.length() - 1)) + sum_str.charAt(sum_str.length() - 1));
            cnt++;

            if (num == N) {
                break;
            }
        }

        System.out.println(cnt);
    }
}
