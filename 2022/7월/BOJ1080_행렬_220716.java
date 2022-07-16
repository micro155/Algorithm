package algorithm_220716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1080_행렬_220716 {

    private static int N, M, arr[][];
    private static boolean check[][];

    private static int answer() {

        if (N < 3 || M < 3) {
            return -1;
        }

        int count = 0;

        for (int i = 0; i <= N - 3; i++) {
            for (int j = 0; j <= M - 3; j++) {
                if (i == N - 3 && !(check[i][j] == check[i + 1][j] && check[i][j] == check[i + 2][j])) {
                    return -1;
                }
                if (j == M - 3 && !(check[i][j] == check[i][j + 1] && check[i][j] == check[i][j + 2])) {
                    return -1;
                }

                if (check[i][j]) {
                    changeNum(i, j);
                    count++;
                }
            }
        }

        boolean flag = check[N - 3][M - 3];
        for (int i = N - 1; i > N - 3; i--) {
            for (int j = M - 1; j > M - 3; j--) {
                if (flag != check[i][j]) return -1;
            }
        }

        return count;
    }

    private static void changeNum(int x, int y) {
        for (int i = x; i < x + 3; i++) {
            for (int j = y; j < y + 3; j++) {
                check[i][j] = !check[i][j];
            }
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        check = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = input.charAt(j);
            }
        }

        int diff = 0;
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < M; j++) {
                int num = input.charAt(j);
                if (arr[i][j] != num) {
                    check[i][j] = true;
                    diff++;
                }
            }
        }

        if (diff == 0) {
            System.out.println(0);
        } else {
            System.out.println(answer());
        }
    }
}
