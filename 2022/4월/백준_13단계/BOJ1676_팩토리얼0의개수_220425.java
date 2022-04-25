package algorithm_220425;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ1676_팩토리얼0의개수_220425 {

    private static int N;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        int cnt = 0;

        while (N >= 5) {
            cnt += N / 5;
            N /= 5;
        }

        System.out.println(cnt);

    }
}
