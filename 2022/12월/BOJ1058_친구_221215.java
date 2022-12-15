package algorithm_221215;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ1058_친구_221215 {

    private static int N;
    private static String arr[];
    private static int floyd[][];

    private static void make() {

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if (i == j || j == k || k == i) {
                        continue;
                    }

                    if (floyd[j][k] > floyd[j][i] + floyd[i][k]) {
                        floyd[j][k] = floyd[j][i] + floyd[i][k];
                    }
                }
            }
        }
    }

    private static int floyd_num() {
        int max = 0;

        for (int i = 0; i < N; i++) {
            int sum = 0;

            for (int j = 0; j < N; j++) {
                if (floyd[i][j] <= 2) {
                    sum++;
                }
            }

            if (max < sum) {
                max = sum;
            }
        }

        return max;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        floyd = new int[51][51];
        arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                if (i == j) {
                    floyd[i][j] = 9999;
                    continue;
                }

                char c = arr[i].charAt(j);

                if (c == 'Y') {
                    floyd[i][j] = 1;
                } else {
                    floyd[i][j] = 9999;
                }
            }
        }

        make();

        int result = floyd_num();

        System.out.println(result);
    }
}
