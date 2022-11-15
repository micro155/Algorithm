package algorithm_221115;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ9372_상근이의여행_221115 {

    private static int T, N, M;
    private static boolean visited[];
    private static boolean arr[][];

    private static int bfs(int start) {

        visited[start] = true;
        int result = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);

        while (!queue.isEmpty()) {
            result++;
            int s = queue.poll();
            for (int i = 1; i <= N; i++) {
                if (arr[s][i] == true && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }

        return result;
    }


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            arr = new boolean[N + 1][N + 1];
            visited = new boolean[N + 1];

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                arr[a][b] = true;
                arr[b][a] = true;
            }

            int result = bfs(1);
            System.out.println(result - 1);
        }
    }
}
