package algorithm_220327;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ17413_단어뒤집기2_220327 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        boolean tagging = false;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == '<') {
                while (!stack.isEmpty()) {
                    char stack_c = stack.pop();
                    sb.append(stack_c);
                }
                sb.append(c);
                tagging = true;
            } else if (c == '>') {
                sb.append(c);
                tagging = false;
            } else {
                if (tagging) {
                    sb.append(c);
                } else {
                    if (c == ' ') {
                        while (!stack.isEmpty()) {
                            char stack_c = stack.pop();
                            sb.append(stack_c);
                        }
                        sb.append(' ');
                    } else {
                        stack.push(c);
                    }
                }
            }

            if (i == input.length() - 1) {
                while (!stack.isEmpty()) {
                    char stack_c = stack.pop();
                    sb.append(stack_c);
                }
            }
        }

        System.out.println(sb);
    }
}
