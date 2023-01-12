package algorithm_230112;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1246_온라인판매_230112 {

    private static int N, M, arr[];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];

        for (int i = 0; i < M; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int result = 0;
        int max = 0;
        int price = 0;

        for (int i = 0; i < M; i++) {
            if (M - i < N) {
                result = arr[i] * (M - i);
            } else {
                result = arr[i] * N;
            }

            if (max < result) {
                price = arr[i];
                max = result;
            }
        }

        System.out.print(price + " " + max);
    }
}
