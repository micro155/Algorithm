package algorithm_220912;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ20168_골목대장호석_기능성_220912 {

    private static int N, M, A, B, C, answer;
    private static ArrayList<Point> pointList[];
    private static boolean visited[];

    private static class Point {
        int end;
        int cost;

        public Point(int end, int cost) {
            this.end = end;
            this.cost = cost;
        }
    }

    private static void dfs(int cur, int cost, int max) {

        if (cur == B) {
            answer = Math.min(answer, max);
            return;
        }
        if (cost <= 0) {
            return;
        }

        for (int i = 0; i < pointList[cur].size(); i++) {
            int next = pointList[cur].get(i).end;
            int nextCost = pointList[cur].get(i).cost;

            if (visited[next] || cost < nextCost) {
                continue;
            }

            visited[next] = true;
            dfs(next, cost - nextCost, Math.max(max, nextCost));
            visited[next] = false;
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        answer = Integer.MAX_VALUE;
        visited = new boolean[N + 1];

        pointList = new ArrayList[N + 1];

        for (int i = 0; i <= N; i++) {
            pointList[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            pointList[start].add(new Point(end, cost));
            pointList[end].add(new Point(start, cost));
        }

        dfs(A, C, 0);

        if (answer == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(answer);
        }

    }
}
