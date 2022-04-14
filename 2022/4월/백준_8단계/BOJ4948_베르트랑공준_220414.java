package algorithm_220414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ4948_베르트랑공준_220414 {

    private static int N;
    private static boolean arr[];

    private static void prime() {

        arr[0] = true;
        arr[1] = true;
        for (int i = 2; i <= Math.sqrt(arr.length); i++) {
            if (arr[i])
                continue;
            for (int j = i * i; j < arr.length; j += i) {
                arr[j] = true;
            }
        }

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr = new boolean[246913];

        prime();

        while (true) {
            N = Integer.parseInt(br.readLine());

            if (N == 0) {
                break;
            }

            int cnt = 0;

            for (int i = N + 1; i <= 2 * N; i++) {
                if (!arr[i])
                    cnt++;
            }

            System.out.println(cnt);
        }

    }
}
