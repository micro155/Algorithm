package algorithm_220409;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ1065_한수_220409 {

    private static int N;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 1; i <= N; i++) {
            boolean notDiff = false;

            String num_str = String.valueOf(i);
            int index = 0;
            int prev = 0;
            int diff = 0;
            while (index < num_str.length()) {
                int current = Integer.parseInt(String.valueOf(num_str.charAt(index)));

                if (index > 0) {
                    if (index == 1) {
                        diff = current - prev;
                    } else {
                        if (diff != current - prev) {
                            notDiff = true;
                            break;
                        }
                    }
                }

                prev = current;
                index++;
            }

            if (!notDiff) {
                result++;
            }

        }

        System.out.println(result);
    }
}
