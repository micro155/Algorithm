package algorithm_221208;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ5555_반지_221208 {

    private static int N;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String standard = br.readLine();
        N = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            input += input;

            if (input.contains(standard)) {
                result++;
            }
        }

        System.out.println(result);
    }
}
