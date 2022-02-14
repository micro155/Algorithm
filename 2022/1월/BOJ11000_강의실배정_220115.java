package algorithm_220115;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ11000_강의실배정_220115 {

    private static int N;
    private static Room room[];


    private static class Room implements Comparable<Room> {
        private int start;
        private int end;

        public Room(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Room o) {
            if (this.start == o.start) {
                return this.end - o.end;
            }
            return this.start - o.start;
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        room = new Room[N];
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            room[i] = new Room(start, end);
        }

        Arrays.sort(room);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(room[0].end);

        for (int i = 1; i < N; i++) {
            if (room[i].start >= pq.peek()) {
                pq.poll();
            }
            pq.add(room[i].end);
        }

        System.out.println(pq.size());
    }
}
