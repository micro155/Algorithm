package algorithm_220716;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ5525_IOIOI_220716 {

    private static int N, M;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        String input = br.readLine();
        int result = 0;


        for (int i = 0; i < M; i++) {
            if (input.charAt(i) == 'O') continue;
            int O = 0;
            while (i + 2 < M && input.charAt(i + 1) == 'O' && input.charAt(i + 2) == 'I') {
                O++;
                i += 2;
                if (O == N) {
                    O--;
                    result++;
                }
            }
        }
        System.out.println(result);

    }
}
