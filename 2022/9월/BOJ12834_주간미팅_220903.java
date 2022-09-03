package algorithm_220903;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ12834_주간미팅_220903 {

    private static int N, V, E, A, B;
    private static ArrayList<Cost> nodeList[];
    private static ArrayList<Integer> home_list;

    private static class Cost implements Comparable<Cost> {
        int node;
        int distance;

        public Cost(int node, int distance) {
            this.node = node;
            this.distance = distance;
        }

        @Override
        public int compareTo(Cost o) {
            return this.distance - o.distance;
        }
    }

    private static long dijkstra(int start) {
        PriorityQueue<Cost> pq = new PriorityQueue<>();
        long d[] = new long[V + 1];
        for (int i = 1; i <= V; i++) {
            d[i] = Integer.MAX_VALUE;
        }
        d[start] = 0;
        pq.add(new Cost(start, 0));

        while (!pq.isEmpty()) {
            int current = pq.peek().node;
            int distance = pq.poll().distance;

            if (d[current] < distance)
                continue;

            for (int i = 0; i < nodeList[current].size(); i++) {
                int next = nodeList[current].get(i).node;
                int nextDistance = distance + nodeList[current].get(i).distance;

                if (d[next] > nextDistance) {
                    d[next] = nextDistance;
                    pq.add(new Cost(next, nextDistance));
                }
            }
        }

        long result = 0;

        if (d[A] == Integer.MAX_VALUE) {
            result -= 1;
        } else {
            result += d[A];
        }
        if (d[B] == Integer.MAX_VALUE) {
            result -= 1;
        } else {
            result += d[B];
        }

        return result;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        home_list = new ArrayList<>();

        N = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        nodeList = new ArrayList[V + 1];
        long result = 0;

        for (int i = 0; i < nodeList.length; i++) {
            nodeList[i] = new ArrayList<>();
        }

        st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            home_list.add(Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            nodeList[a].add(new Cost(b, l));
            nodeList[b].add(new Cost(a, l));
        }

        for (int i = 0; i < home_list.size(); i++) {
            long distance = dijkstra(home_list.get(i));
            result += distance;
        }

        System.out.println(result);
    }
}
