package algorithm_230131;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2502_떡먹는호랑이_230131 {

    private static int D, K, arr[], arr2[];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        D = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new int[31];
        arr2 = new int[31];

        arr[1] = 1;
        arr[2] = 0;
        arr2[1] = 0;
        arr2[2] = 1;

        for (int i = 3; i <= D; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
            arr2[i] = arr2[i - 2] + arr2[i - 1];
        }

        for (int i = 1; i <= K; i++) {
            int spare = K - (arr[D] * i);
            if (spare % arr2[D] == 0) {
                System.out.println(i);
                System.out.println(spare / arr2[D]);
                return;
            }
        }

    }
}
