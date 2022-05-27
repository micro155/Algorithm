package algorithm_220527;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ10866_덱_220527 {


    private static int N;
    private static Deque<Integer> deque;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        deque = new ArrayDeque<>();


        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String oper = st.nextToken();

            if (oper.equals("push_front")) {
                deque.addFirst(Integer.parseInt(st.nextToken()));
            } else if (oper.equals("push_back")) {
                deque.addLast(Integer.parseInt(st.nextToken()));
            } else if (oper.equals("pop_front")) {
                if (deque.isEmpty()) {
                    System.out.println(-1);
                } else {
                    int num = deque.pollFirst();
                    System.out.println(num);
                }
            } else if (oper.equals("pop_back")) {
                if (deque.isEmpty()) {
                    System.out.println(-1);
                } else {
                    int num = deque.pollLast();
                    System.out.println(num);
                }
            } else if (oper.equals("size")) {
                System.out.println(deque.size());
            } else if (oper.equals("empty")) {
                if (deque.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (oper.equals("front")) {
                if (deque.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(deque.peekFirst());
                }
            } else {
                if (deque.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(deque.peekLast());
                }

            }
        }
    }
}
