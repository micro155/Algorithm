package algorithm_220407;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2438_별찍기_1_220407 {

    private static int N;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j <= i; j++) {
                sb.append("*");
            }
            System.out.println(sb);
        }
    }
}
