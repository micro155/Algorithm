package algorithm_220226;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14503_로봇청소기_220226 {

    private static int N, M;
    private static int max_area;
    private static int arr[][];
    private static int dx[] = {-1, 0, 1, 0};
    private static int dy[] = {0, 1, 0, -1};

    private static void dfs(int x, int y, int direct) {

        if (arr[x][y] == 0) {
            arr[x][y] = 2;
            max_area++;
        }

        boolean flag = false;
        int origin = direct;
        for (int i = 0; i < 4; i++) {
            int nd = (direct + 3) % 4;
            int nx = x + dx[nd];
            int ny = y + dy[nd];

            if (nx > 0 && ny > 0 && nx < N && ny < M) {
                if (arr[nx][ny] == 0) {
                    dfs(nx, ny, nd);
                    flag = true;
                    break;
                }
            }
            direct = (direct + 3) % 4;
        }

        if (!flag) {
            int nd = (origin + 2) % 4;
            int nx = x + dx[nd];
            int ny = y + dy[nd];

            if (nx > 0 && ny > 0 && nx < N && ny < M) {
                if (arr[nx][ny] != 1) {
                    dfs(nx, ny, origin);
                }
            }
        }

    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        max_area = 0;

        st = new StringTokenizer(br.readLine());

        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(r, c, d);

        System.out.println(max_area);
    }
}
