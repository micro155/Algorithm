package algorithm_221017;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2495_연속구간_221017 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {

            String input = br.readLine();

            int num = input.charAt(0) - '0';
            int max = 0;
            int cnt = 1;
            for (int j = 1; j < input.length(); j++) {
                int cur = input.charAt(j) - '0';
                if (num == cur) {
                    cnt++;
                    max = Math.max(max, cnt);
                } else {
                    num = cur;
                    cnt = 1;
                }
            }
            if (max == 0) {
                System.out.println(1);
            } else {
                System.out.println(max);
            }
        }
    }
}
