package algorithm_220710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ1584_게임_220710 {

    private static int N, M;
    private static int arr[][];
    private static boolean visited[][];

    private static class Node implements Comparable<Node> {
        int x;
        int y;
        int cost;

        public Node(int x, int y, int cost) {
            this.x = x;
            this.y = y;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return this.cost - o.cost;
        }
    }


    private static int bfs() {

        int dx[] = {1, 0, -1, 0};
        int dy[] = {0, -1, 0, 1};

        Queue<Node> queue = new PriorityQueue<>();
        queue.add(new Node(0, 0, 0));

        visited[0][0] = true;
        arr[0][0] = 0;

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            int cost = node.cost;

            for (int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= 501 || ny >= 501)
                    continue;
                if (visited[nx][ny])
                    continue;
                if (arr[nx][ny] == -1)
                    continue;

                visited[nx][ny] = true;
                arr[nx][ny] += cost;
                queue.add(new Node(nx, ny, arr[nx][ny]));
            }
        }

        return arr[500][500];
    }


    public static void main(String[] args) throws Exception {


        arr = new int[501][501];
        visited = new boolean[501][501];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for (int j = Math.min(x1, x2); j <= Math.max(x1, x2); j++) {
                for (int k = Math.min(y1, y2); k <= Math.max(y1, y2); k++) {
                    arr[j][k] = 1;
                }
            }
        }

        M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for (int j = Math.min(x1, x2); j <= Math.max(x1, x2); j++) {
                for (int k = Math.min(y1, y2); k <= Math.max(y1, y2); k++) {
                    arr[j][k] = -1;
                }
            }
        }

        int result = bfs();

        System.out.println(visited[500][500] ? result : -1);
    }
}
