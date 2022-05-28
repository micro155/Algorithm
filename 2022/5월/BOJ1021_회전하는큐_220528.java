package algorithm_220528;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ1021_회전하는큐_220528 {

    private static int N, M;
    private static LinkedList<Integer> deque;
    private static int arr[];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int cnt = 0;

        arr = new int[M];
        deque = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            deque.offer(i);
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {

            int target_index = deque.indexOf(arr[i]);
            int half_index;

            if (deque.size() % 2 == 0) {
                half_index = deque.size() / 2 - 1;
            } else {
                half_index = deque.size() / 2;
            }

            if (target_index <= half_index) {

                for (int j = 0; j < target_index; j++) {
                    int num = deque.pollFirst();
                    deque.offerLast(num);
                    cnt++;
                }
            } else {
                for (int j = 0; j < deque.size() - target_index; j++) {
                    int num = deque.pollLast();
                    deque.offerFirst(num);
                    cnt++;
                }
            }
            deque.pollFirst();
        }

        System.out.println(cnt);
    }
}
