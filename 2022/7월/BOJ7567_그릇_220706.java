package algorithm_220706;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ7567_그릇_220706 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int sum = 10;

        boolean reverse;

        if (input.charAt(0) == '(') {
            reverse = false;
        } else {
            reverse = true;
        }

        for (int i = 1; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == '(') {
                if (!reverse) {
                    sum += 5;
                } else {
                    sum += 10;
                    reverse = false;
                }
            } else {
                if (!reverse) {
                    sum += 10;
                    reverse = true;
                } else {
                    sum += 5;
                }
            }
        }

        System.out.println(sum);
    }
}
