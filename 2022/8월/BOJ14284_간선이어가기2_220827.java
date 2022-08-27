package algorithm_220827;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ14284_간선이어가기2_220827 {

    private static int N, M, S, T, d[];
    private static ArrayList<Pair> arr[];

    private static class Pair implements Comparable<Pair> {
        int a;
        int b;

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public int compareTo(Pair o) {
            return this.a - o.a;
        }
    }

    private static int dijkstra(int a) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int res[] = new int[N + 1];
        Arrays.fill(res, Integer.MAX_VALUE);
        res[a] = 0;
        pq.add(new Pair(0, a));

        while (!pq.isEmpty()) {
            int cost = pq.peek().a;
            int here = pq.peek().b;

            pq.poll();

            for (int i = 0; i < arr[here].size(); i++) {
                int there = arr[here].get(i).a;
                int nextCost = cost + arr[here].get(i).b;
                if (res[there] > nextCost) {
                    res[there] = nextCost;
                    pq.add(new Pair(nextCost, there));
                }
            }
        }
        return res[T];

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        d = new int[N + 1];
        arr = new ArrayList[N + 1];

        for (int i = 0; i <= N; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            arr[a].add(new Pair(b, c));
            arr[b].add(new Pair(a, c));
        }

        st = new StringTokenizer(br.readLine());
        S = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());

        int result = dijkstra(S);

        System.out.println(result);
    }
}
