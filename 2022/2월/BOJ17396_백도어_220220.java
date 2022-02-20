package algorithm_220220;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ17396_백도어_220220 {

    private static int N, M;
    private static long d[];
    private static Set<Integer> set;
    private static PriorityQueue<Pair> pq;
    private static ArrayList<Pair> list[];
    private static boolean visited[];

    private static class Pair implements Comparable<Pair> {
        int end;
        long distance;

        public Pair(int end, long distance) {
            this.end = end;
            this.distance = distance;
        }

        @Override
        public int compareTo(Pair o) {
            if (this.distance - o.distance > 0) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        pq = new PriorityQueue<>();
        d = new long[N];
        visited = new boolean[N];
        set = new HashSet<>();
        list = new ArrayList[N];

        Arrays.fill(d, Long.MAX_VALUE);

        for (int i = 0; i < N; i++) {
            list[i] = new ArrayList<>();
        }

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (i > 0 && i < N && num == 1) {
                set.add(i);
            }
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int distance = Integer.parseInt(st.nextToken());
            list[start].add(new Pair(end, distance));
            list[end].add(new Pair(start, distance));
        }

        d[0] = 0;

        pq.offer(new Pair(0, 0));
        while (!pq.isEmpty()) {
            Pair p = pq.poll();

            if (visited[p.end]) {
                continue;
            }

            visited[p.end] = true;

            for (int i = 0; i < list[p.end].size(); i++) {
                Pair next = list[p.end].get(i);

                if (next.end != N - 1 && set.contains(next.end)) {
                    continue;
                }
                if (d[next.end] > d[p.end] + next.distance) {
                    d[next.end] = d[p.end] + next.distance;
                    pq.offer(new Pair(next.end, d[next.end]));
                }
            }
        }

        if (d[N - 1] == Long.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(d[N - 1]);
        }

    }
}
