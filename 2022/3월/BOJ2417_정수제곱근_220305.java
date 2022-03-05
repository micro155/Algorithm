package algorithm_220305;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2417_정수제곱근_220305 {


    private static long N;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Long.parseLong(br.readLine());

        long start = 0;
        long end = N;
        long min = Long.MAX_VALUE;

        while (start <= end) {

            long mid = (start + end) / 2;
            long result = (long) Math.pow(mid, 2);

            if (result >= 0) {
                if (result >= N) {
                    min = Math.min(min, mid);
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        System.out.println(min);


    }
}
