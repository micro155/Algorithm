package algorithm_220816;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ10102_개표_220816 {

    private static int N;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        String input = br.readLine();

        int a_cnt = 0;
        int b_cnt = 0;
        for (int i = 0; i < N; i++) {
            if (input.charAt(i) == 'A') {
                a_cnt++;
            } else {
                b_cnt++;
            }
        }

        if (a_cnt > b_cnt) {
            System.out.println("A");
        } else if (a_cnt < b_cnt) {
            System.out.println("B");
        } else {
            System.out.println("Tie");
        }
    }
}
