package algorithm_220417;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ10872_팩토리얼_220417 {

    private static int N;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        long sum = 1;

        for (int i = 1; i <= N; i++) {
            sum *= i;
        }

        System.out.println(sum);
    }
}
