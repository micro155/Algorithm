package algorithm_220905;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ1916_최소비용구하기_220905 {

    private static int N, M, S, E;
    private static boolean visited[];
    private static ArrayList<Node> node_list[];

    private static class Node implements Comparable<Node> {
        int dest;
        int cost;

        public Node(int dest, int cost) {
            this.dest = dest;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return this.cost - o.cost;
        }
    }

    private static int dijkstra() {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(S, 0));
        int d[] = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            d[i] = Integer.MAX_VALUE;
        }

        while (!pq.isEmpty()) {
            int end = pq.peek().dest;
            int cost = pq.poll().cost;

            if (d[end] < cost)
                continue;
            if (visited[end])
                continue;

            d[end] = cost;
            visited[end] = true;

            for (int i = 0; i < node_list[end].size(); i++) {
                int next = node_list[end].get(i).dest;
                int next_cost = node_list[end].get(i).cost;

                if (d[next] > d[end] + next_cost) {
                    d[next] = d[end] + next_cost;
                    pq.add(new Node(next, d[next]));
                }
            }
        }

        return d[E];
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        node_list = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i <= N; i++) {
            node_list[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            node_list[s].add(new Node(e, cost));
        }

        StringTokenizer st = new StringTokenizer(br.readLine());

        S = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        int result = dijkstra();

        System.out.println(result);

    }
}
