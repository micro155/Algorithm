package algorithm_220411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2292_벌집_220411 {

    private static int N;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        int cnt = 1;
        int range = 2;

        if (N == 1) {
            System.out.println(1);
        } else {
            while (range <= N) {
                range = range + (6 * cnt);
                cnt++;
            }
            System.out.println(cnt);
        }


    }
}
