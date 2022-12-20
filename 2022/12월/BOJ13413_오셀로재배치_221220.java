package algorithm_221220;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ13413_오셀로재배치_221220 {

    private static int T, N;

    private static int calc(String input, String target) {

        int w_count = 0;
        int b_count = 0;

        for (int i = 0; i < N; i++) {
            char input_c = input.charAt(i);
            char target_c = target.charAt(i);

            if (input_c != target_c) {
                if (input_c == 'W') {
                    w_count++;
                } else {
                    b_count++;
                }
            }
        }

        return Math.min(w_count, b_count) + Math.abs(w_count - b_count);
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < T; tc++) {
            N = Integer.parseInt(br.readLine());

            String input = br.readLine();
            String compare = br.readLine();

            System.out.println(calc(input, compare));
        }
    }
}
