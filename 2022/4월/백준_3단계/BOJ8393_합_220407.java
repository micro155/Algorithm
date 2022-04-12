package algorithm_220407;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ8393_합_220407 {

    private static int N;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
