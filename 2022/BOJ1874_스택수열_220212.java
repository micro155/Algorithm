package algorithm_220212;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class BOJ1874_스택수열_220212 {


    private static int N;
    private static Stack<Integer> stack;
    private static ArrayList<Character> oper;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        oper = new ArrayList<>();
        stack = new Stack<>();
        int start = 0;

        while (N-- > 0) {
            int value = Integer.parseInt(br.readLine());

            if (value > start) {
                for (int i = start + 1; i <= value; i++) {
                    stack.push(i);
                    oper.add('+');
                }
                start = value;
            } else if (stack.peek() != value) {
                System.out.println("NO");
                return;
            }

            stack.pop();
            oper.add('-');

        }

        for (int i = 0; i < oper.size(); i++) {
            System.out.println(oper.get(i));
        }


    }
}
