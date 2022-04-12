package algorithm_220411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ1193_분수찾기_220411 {

    private static int N;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        int prev_cnt_sum = 0;
        int cross_cnt = 1;

        while (true) {

            if (N <= prev_cnt_sum + cross_cnt) {
                if (cross_cnt % 2 == 1) {
                    System.out.println((cross_cnt - (N - prev_cnt_sum - 1)) + "/" + (N - prev_cnt_sum));
                    break;
                } else {
                    System.out.println((N - prev_cnt_sum) + "/" + (cross_cnt - (N - prev_cnt_sum - 1)));
                    break;
                }
            } else {
                prev_cnt_sum += cross_cnt;
                cross_cnt++;
            }
        }

    }
}
