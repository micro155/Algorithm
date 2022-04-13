package algorithm_220413;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2581_소수_220413 {

    private static int M, N;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        M = Integer.parseInt(br.readLine());
        N = Integer.parseInt(br.readLine());
        boolean check = false;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = M; i <= N; i++) {

            int cnt = 0;
            for (int j = 1; j <= i; j++) {

                if (i % j == 0)
                    cnt++;
            }
            if (cnt == 2) {
                check = true;
                sum += i;
                min = Math.min(min, i);
            }

        }

        if (check) {
            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.println(-1);
        }

    }
}
