package algorithm_221113;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ11899_괄호끼워넣기_221113 {

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
                stack.add(c);
            } else {
                if (stack.isEmpty()) {
                    result++;
                } else {
                    stack.pop();
                }
            }

        }

        result += stack.size();
        System.out.println(result);
    }
}
