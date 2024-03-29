package algorithm_220705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1520_내리막길_220705 {

    private static int M, N;
    private static int arr[][];
    private static int dp[][];
    private static int dx[] = {1, 0, -1, 0};
    private static int dy[] = {0, -1, 0, 1};

    private static int dfs(int x, int y) {

        if (x == M - 1 && y == N - 1) {
            return 1;
        }
        if (dp[x][y] != -1) {
            return dp[x][y];
        }

        dp[x][y] = 0;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx >= M || ny >= N)
                continue;

            if (arr[x][y] > arr[nx][ny])
                dp[x][y] += dfs(nx, ny);
        }

        return dp[x][y];

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        arr = new int[M][N];
        dp = new int[M][N];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                dp[i][j] = -1;
            }
        }


        System.out.println(dfs(0, 0));


    }
}
