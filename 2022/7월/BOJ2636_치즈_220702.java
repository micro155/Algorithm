package algorithm_220702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ2636_치즈_220702 {


    private static int arr[][];
    private static int N, M;
    private static boolean visited[][];
    private static int dx[] = {1, 0, -1, 0};
    private static int dy[] = {0, -1, 0, 1};
    private static int cheeseCnt;
    private static ArrayList<Point> cheeseList;


    private static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


    private static void bfs() {
        Queue<Point> queue = new LinkedList<>();
        visited = new boolean[N][M];
        queue.add(new Point(0, 0));
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int x = queue.peek().x;
            int y = queue.poll().y;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
                if (visited[nx][ny]) continue;


                if (arr[nx][ny] == 1) {
                    cheeseCnt--;
                    arr[nx][ny] = 0;
                } else if (arr[nx][ny] == 0) {
                    queue.add(new Point(nx, ny));
                }
                visited[nx][ny] = true;
            }
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        cheeseList = new ArrayList<>();
        cheeseCnt = 0;
        arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 1) {
                    cheeseList.add(new Point(i, j));
                    cheeseCnt++;
                }
            }
        }

        int resultTime = 0;
        int resultCnt = 0;


        while (cheeseCnt != 0) {
            resultTime++;
            resultCnt = cheeseCnt;
            bfs();
        }


        System.out.println(resultTime);
        System.out.println(resultCnt);

    }
}
