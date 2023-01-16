package algorithm_230116;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1743_음식물피하기_230116 {

    private static int N, M, K, arr[][], maxCnt;
    private static int dx[] = {1, 0, -1, 0};
    private static int dy[] = {0, -1, 0, 1};
    private static boolean visited[][];

    private static int dfs(int x, int y) {

        visited[x][y] = true;
        int cnt = 0;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 1 || nx > N || ny < 1 || ny > M)
                continue;
            if (visited[nx][ny])
                continue;
            if (arr[nx][ny] == 0)
                continue;

            cnt += dfs(nx, ny) + 1;
        }

        return cnt;

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        arr = new int[N + 1][M + 1];
        visited = new boolean[N + 1][M + 1];
        maxCnt = 0;

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[x][y] = 1;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if (arr[i][j] == 1 && !visited[i][j]) {
                    maxCnt = Math.max(maxCnt, dfs(i, j) + 1);
                }
            }
        }

        System.out.println(maxCnt);
    }
}
