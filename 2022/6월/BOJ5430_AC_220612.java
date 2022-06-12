package algorithm_220612;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class BOJ5430_AC_220612 {

    private static StringBuilder sb = new StringBuilder();

    private static void oper(String oper, ArrayDeque<Integer> deque) {

        boolean isRight = true;

        for (char cmd : oper.toCharArray()) {

            if (cmd == 'R') {
                isRight = !isRight;
                continue;
            }

            if (isRight) {

                if (deque.pollFirst() == null) {
                    sb.append("error").append("\n");
                    return;
                }

            } else {
                if (deque.pollLast() == null) {
                    sb.append("error").append("\n");
                    return;
                }
            }
        }

        printDeque(deque, isRight);
    }


    private static void printDeque(ArrayDeque<Integer> deque, boolean isRight) {

        sb.append("[");
        if (deque.size() > 0) {
            if (isRight) {
                sb.append(deque.pollFirst());

                while (!deque.isEmpty()) {
                    sb.append(",").append(deque.pollFirst());
                }
            } else {
                sb.append(deque.pollLast());

                while (!deque.isEmpty()) {
                    sb.append(",").append(deque.pollLast());
                }
            }
        }
        sb.append("]").append("\n");
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < T; tc++) {
            String oper = br.readLine();

            int len = Integer.parseInt(br.readLine());
            ArrayDeque<Integer> deque = new ArrayDeque<>();

            StringTokenizer st = new StringTokenizer(br.readLine(), "[],");

            for (int i = 0; i < len; i++) {
                deque.add(Integer.parseInt(st.nextToken()));
            }

            oper(oper, deque);

        }

        System.out.println(sb);
    }
}
