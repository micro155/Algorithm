package algorithm_220802;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ5972_택배배송_220802 {

    private static int N, M, d[];
    private static boolean visited[];
    private static ArrayList<Node> arrayList[];

    private static class Node implements Comparable<Node> {
        int d;
        int cost;

        public Node(int d, int cost) {
            this.d = d;
            this.cost = cost;
        }


        @Override
        public int compareTo(Node o) {
            return this.cost - o.cost;
        }
    }

    private static void dijkstra() {
        PriorityQueue<Node> q = new PriorityQueue<>();
        d[1] = 0;
        q.offer(new Node(1, 0));

        while (!q.isEmpty()) {
            Node current = q.poll();

            if (!visited[current.d])
                visited[current.d] = true;
            else
                continue;

            for (int i = 0; i < arrayList[current.d].size(); i++) {
                Node next = arrayList[current.d].get(i);
                if (d[next.d] > d[current.d] + next.cost) {
                    d[next.d] = d[current.d] + next.cost;
                    q.offer(new Node(next.d, d[next.d]));
                }
            }
        }
    }


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        d = new int[N + 1];
        visited = new boolean[N + 1];
        arrayList = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            arrayList[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            arrayList[a].add(new Node(b, c));
            arrayList[b].add(new Node(a, c));
        }

        Arrays.fill(d, Integer.MAX_VALUE);

        dijkstra();
        System.out.println(d[N]);
    }
}
