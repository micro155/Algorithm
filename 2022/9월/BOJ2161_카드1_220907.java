package algorithm_220907;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class BOJ2161_카드1_220907 {

    private static int N;
    private static Deque<Integer> deque;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        deque = new ArrayDeque<>();

        for (int i = 1; i <= N; i++) {
            deque.addLast(i);
        }

        StringBuilder sb = new StringBuilder();

        while (!deque.isEmpty()) {

            int trash = deque.pollFirst();

            sb.append(trash).append(" ");

            if (deque.isEmpty())
                break;

            int back = deque.pollFirst();

            deque.addLast(back);
        }

        System.out.println(sb);
    }
}
