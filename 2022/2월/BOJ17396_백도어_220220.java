package algorithm_220220;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ17396_백도어_220220 {

    private static int N, M;
    private static int d[];
    private static Set<Integer> set;
    private static PriorityQueue<Pair> pq;

    private static class Pair implements Comparable<Pair> {
        int start;
        int end;
        int distance;

        public Pair(int start, int end, int distance) {
            this.start = start;
            this.end = end;
            this.distance = distance;
        }

        @Override
        public int compareTo(Pair o) {
            return this.start - o.start;
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        set = new HashSet<>();
        pq = new PriorityQueue<>();
        d = new int[N];

        Arrays.fill(d, Integer.MAX_VALUE);

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num == 1 && i < N - 1) {
                set.add(i);
            }
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int distance = Integer.parseInt(st.nextToken());
            pq.add(new Pair(start, end, distance));
            pq.add(new Pair(end, start, distance));
        }

        d[0] = 0;
        while(!pq.isEmpty()) {
            Pair p = pq.poll();

            if (set.contains(p.end) || set.contains(p.start)) {
                continue;
            }
            if (d[p.end] > d[p.start] + p.distance) {
                d[p.end] = d[p.start] + p.distance;
            }
            if (p.start > p.end) {
                if (d[p.start] > d[p.end] + p.distance) {
                    d[p.start] = d[p.end] + p.distance;
                }
            }
        }

        if (d[N - 1] == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(d[N - 1]);
        }

    }
}
