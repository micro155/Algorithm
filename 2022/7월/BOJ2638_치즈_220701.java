package algorithm_220630;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ2638_치즈_220701 {

    private static int N, M;
    private static int arr[][];
    private static int dx[] = {1, 0, -1, 0};
    private static int dy[] = {0, -1, 0, 1};
    private static boolean visited[][];
    private static ArrayList<Point> arrayList;
    private static int cheeseCnt;

    private static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static void dfs(int x, int y) {

        visited[x][y] = true;
        arr[x][y] = 2;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
                continue;
            }
            if (visited[nx][ny] || arr[nx][ny] == 1) {
                continue;
            }

            dfs(nx, ny);
        }
    }


    private static void bfs() {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(0, 0));
        visited[0][0] = true;
        arr[0][0] = 2;

        while (!queue.isEmpty()) {
            int x = queue.peek().x;
            int y = queue.poll().y;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
                if (visited[nx][ny] || arr[nx][ny] == 1) continue;

                arr[nx][ny] = 2;
                queue.add(new Point(nx, ny));
                visited[nx][ny] = true;
            }
        }
    }

    private static void melting() {
        for (int i = 0; i < arrayList.size(); i++) {
            int x = arrayList.get(i).x;
            int y = arrayList.get(i).y;
            int cnt = 0;

            for (int j = 0; j < 4; j++) {
                int nx = x + dx[j];
                int ny = y + dy[j];

                if (arr[nx][ny] == 2) {
                    cnt++;
                }
            }

            if (cnt >= 2) { // 외부 공기와 2변 이상 접촉한 경우
                arr[x][y] = 0;
                cheeseCnt--;
                arrayList.remove(i);
                i--;
            }
        }
    }


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        arrayList = new ArrayList<>();
        cheeseCnt = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 1) {
                    arrayList.add(new Point(i, j));
                    cheeseCnt += 1;
                }
            }
        }

        int time = 0;


        while (cheeseCnt != 0) {

            time++;
            visited = new boolean[N][M];
            dfs(0, 0);
            bfs();
            melting();

        }

        System.out.println(time);


    }
}
