package algorithm_220801;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ10799_쇠막대기_220801 {

    private static String input;
    private static Stack<Character> stack;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        input = br.readLine();
        stack = new Stack<>();
        int result = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else if (c == ')' && input.charAt(i - 1) == '(') {
                stack.pop();
                result += stack.size();
            } else {
                result++;
                stack.pop();
            }
        }

        System.out.println(result);
    }
}
