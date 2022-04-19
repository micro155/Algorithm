package algorithm_220419;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1018_체스판다시칠하기_220419 {

    private static int N, M;
    private static boolean arr[][];
    private static int min = 64;

    private static void find(int x, int y) {
        int end_x = x + 8;
        int end_y = y + 8;
        int cnt = 0;

        boolean tf = arr[x][y];

        for (int i = x; i < end_x; i++) {
            for (int j = y; j < end_y; j++) {
                if (arr[i][j] != tf) {
                    cnt++;
                }

                tf = !tf;
            }
            tf = !tf;
        }

        cnt = Math.min(cnt, 64 - cnt);
        min = Math.min(min, cnt);
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == 'W') {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }

        int n_row = N - 7;
        int m_col = M - 7;

        for (int i = 0; i < n_row; i++) {
            for (int j = 0; j < m_col; j++) {
                find(i, j);
            }
        }

        System.out.println(min);
    }
}
