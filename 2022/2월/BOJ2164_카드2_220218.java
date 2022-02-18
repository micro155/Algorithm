package algorithm_220218;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class BOJ2164_카드2_220218 {


    private static int N;
    private static Deque<Integer> dq;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        dq = new ArrayDeque<>();

        for (int i = 1; i <= N; i++) {
            dq.add(i);
        }

        int cnt = 1;
        while (true) {
            if (dq.size() == 1) {
                break;
            }
            if (cnt % 2 == 1) {
                dq.pop();
            } else {
                int num = dq.peek();
                dq.pop();
                dq.add(num);
            }
            cnt++;
        }

        System.out.println(dq.peek());

    }
}
