package algorithm_220426;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11050_이항계수1_220426 {

    private static int N, K;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        int cross = N;
        int sum = 1;
        int div = 1;

        for (int i = 1; i <= K; i++) {
            sum *= cross--;
            div *= i;
        }

        System.out.println(sum / div);


    }
}
