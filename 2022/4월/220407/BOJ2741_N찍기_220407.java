package algorithm_220407;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2741_N찍기_220407 {

    private static int N;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
    }
}
