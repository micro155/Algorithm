package algorithm_220605;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ10828_스택_220605 {

    private static int N;
    private static Stack<Integer> stack;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String input = st.nextToken();

            if (input.equals("push")) {
                int num = Integer.parseInt(st.nextToken());

                stack.push(num);
            } else if (input.equals("pop")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    int num = stack.pop();

                    System.out.println(num);
                }
            } else if (input.equals("size")) {
                System.out.println(stack.size());
            } else if (input.equals("empty")) {
                if (stack.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peek());
                }
            }
        }

    }
}
