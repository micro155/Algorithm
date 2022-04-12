package algorithm_220410;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ11720_숫자의합_220410 {

    private static int N;
    private static String input;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        input = br.readLine();
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(String.valueOf(input.charAt(i)));
        }

        System.out.println(sum);
    }
}
