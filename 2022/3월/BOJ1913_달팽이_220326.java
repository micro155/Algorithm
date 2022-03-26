package algorithm_220326;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ1913_달팽이_220326 {

    private static int N, K;
    private static int arr[][];
    private static boolean visited[][];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        visited = new boolean[N][N];
        int result_x = 0;
        int result_y = 0;

        int value = 1;

        int x = N / 2, y = N / 2;

        int limit = 1;
        while (true) {
            for (int i = 0; i < limit; i++) {
                arr[y--][x] = value++;
            }
            if (value - 1 == N * N) break;
            for (int i = 0; i < limit; i++) {
                arr[y][x++] = value++;
            }

            limit++;
            for (int i = 0; i < limit; i++) {
                arr[y++][x] = value++;
            }

            for (int i = 0; i < limit; i++) {
                arr[y][x--] = value++;
            }
            limit++;
        }

        for (int i = 0; i < N; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == K) {
                    result_x = i + 1;
                    result_y = j + 1;
                }
                sb.append(arr[i][j]).append(" ");
            }
            System.out.println(sb);
        }
        System.out.println(result_x + " " + result_y);
    }
}
