package algorithm_230122;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ10282_해킹_230122 {

    private static int T, dist[], result, count;
    private static ArrayList<Node> nodes[];
    private static boolean visited[];

    private static class Node implements Comparable<Node> {
        int num;
        int cost;

        public Node(int num, int cost) {
            this.num = num;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return this.cost - o.cost;
        }
    }

    private static void dijkstra(int start) {
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Node(start, 0));
        dist[start] = 0;

        while (!priorityQueue.isEmpty()) {
            int num = priorityQueue.poll().num;

            if (!visited[num]) {
                visited[num] = true;
                count++;
            } else {
                continue;
            }

            for (int i = 0; i < nodes[num].size(); i++) {

                Node node = nodes[num].get(i);

                if (dist[node.num] > dist[num] + node.cost) {
                    dist[node.num] = dist[num] + node.cost;
                    priorityQueue.add(new Node(node.num, dist[node.num]));
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < T; tc++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            dist = new int[n + 1];
            nodes = new ArrayList[n + 1];
            visited = new boolean[n + 1];
            result = 0;
            count = 0;

            Arrays.fill(dist, Integer.MAX_VALUE);

            for (int i = 1; i <= n; i++) {
                nodes[i] = new ArrayList<>();
            }

            for (int i = 0; i < d; i++) {
                st = new StringTokenizer(br.readLine());

                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int s = Integer.parseInt(st.nextToken());

                nodes[b].add(new Node(a, s));
            }

            dijkstra(c);

            for (int i = 1; i <= n; i++) {
                if (dist[i] != Integer.MAX_VALUE)
                    result = Math.max(result, dist[i]);
            }

            System.out.println(count + " " + result);
        }
    }
}
