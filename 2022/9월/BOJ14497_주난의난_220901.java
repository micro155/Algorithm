package algorithm_220901;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ14497_주난의난_220901 {

    private static int N, M, x1, y1, x2, y2, visited[][];
    private static char arr[][];
    private static int dx[] = {0, 1, 0, -1};
    private static int dy[] = {-1, 0, 1, 0};

    private static class Pair {
        int y;
        int x;

        public Pair(int y, int x) {
            this.x = x;
            this.y = y;
        }
    }

    private static void bfs() {
        Deque<Pair> q = new ArrayDeque<>();
        visited[y1][x1] = 1;
        q.addLast(new Pair(y1, x1));

        while (q.size() > 0) {
            int cx = q.peekFirst().x;
            int cy = q.peekFirst().y;

            q.pollFirst();

            if (cx == x2 && cy == y2)
                break;

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx < 1 || nx > M || ny < 1 || ny > N)
                    continue;
                if (visited[ny][nx] > 0)
                    continue;
                if (arr[ny][nx] == '0') {
                    visited[ny][nx] = visited[cy][cx];
                    q.addFirst(new Pair(ny, nx));
                } else {
                    visited[ny][nx] = visited[cy][cx] + 1;
                    q.addLast(new Pair(ny, nx));
                }
            }
        }

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new char[N + 1][M + 1];
        visited = new int[N + 1][M + 1];

        st = new StringTokenizer(br.readLine());

        y1 = Integer.parseInt(st.nextToken());
        x1 = Integer.parseInt(st.nextToken());
        y2 = Integer.parseInt(st.nextToken());
        x2 = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            String input = br.readLine();
            for (int j = 1; j <= M; j++) {
                arr[i][j] = input.charAt(j - 1);
            }
        }

        bfs();

        System.out.println(visited[y2][x2] - 1);
    }
}
