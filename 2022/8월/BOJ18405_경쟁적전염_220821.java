package algorithm_220821;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ18405_경쟁적전염_220821 {

    private static int N, K, X, Y, S, arr[][];
    private static int dx[] = {1, 0, -1, 0};
    private static int dy[] = {0, -1, 0, 1};
    private static Queue<Point> queue;
    private static ArrayList<Point> cnt_list;


    private static class Point implements Comparable<Point> {
        int x;
        int y;
        int num;
        int cnt;

        public Point(int x, int y, int num, int cnt) {
            this.x = x;
            this.y = y;
            this.num = num;
            this.cnt = cnt;
        }

        @Override
        public int compareTo(Point o) {
            return this.num - o.num;
        }
    }

    private static void bfs() {

        while (!queue.isEmpty()) {
            int cx = queue.peek().x;
            int cy = queue.peek().y;
            int cnum = queue.peek().num;
            int ccnt = queue.peek().cnt;

            queue.poll();

            if (ccnt == S) {
                continue;
            }

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx < 0 || ny < 0 || nx >= N || ny >= N)
                    continue;
                if (arr[nx][ny] != 0)
                    continue;

                arr[nx][ny] = cnum;
                queue.add(new Point(nx, ny, cnum, ccnt + 1));
            }
        }

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new int[N][N];
        queue = new LinkedList<>();
        cnt_list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] != 0) {
                    cnt_list.add(new Point(i, j, arr[i][j], 0));
                }
            }
        }

        Collections.sort(cnt_list);

        for (int i = 0; i < cnt_list.size(); i++) {
            queue.add(new Point(cnt_list.get(i).x, cnt_list.get(i).y, cnt_list.get(i).num, cnt_list.get(i).cnt));
        }

        st = new StringTokenizer(br.readLine());

        S = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());

        bfs();

        System.out.println(arr[X - 1][Y - 1]);
    }
}
