package algorithm_220720;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ14235_크리스마스선물_220720 {

    private static int N;
    private static PriorityQueue<Integer> pq;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        pq = new PriorityQueue<>(Collections.reverseOrder());
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            if (num == 0) {
                if (pq.size() > 0) {
                    sb.append(pq.poll()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }

            } else {
                for (int j = 0; j < num; j++) {
                    int n = Integer.parseInt(st.nextToken());
                    pq.add(n);
                }
            }
        }

        System.out.println(sb);
    }
}
