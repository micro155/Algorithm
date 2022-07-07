package algorithm_220707;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ19939_박터뜨리기_220707 {


    private static int N, K;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        int min = (K + 1) * K / 2;

        if (N < min) {
            System.out.println(-1);
        } else if ((N - min) % K == 0) {
            System.out.println(K - 1);
        } else {
            System.out.println(K);
        }

    }
}
