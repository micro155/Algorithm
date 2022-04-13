package algorithm_220413;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1978_소수찾기_220413 {

    private static int N;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        int result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            int cnt = 0;


            for (int j = 1; j <= num; j++) {
                if (num % j == 0)
                    cnt++;
            }

            if (cnt == 2)
                result++;
        }

        System.out.println(result);
    }
}
