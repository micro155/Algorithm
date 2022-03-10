package algorithm_220310;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ9012_괄호_220310 {

    private static int N;
    private static Stack<Character> stack;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            stack = new Stack<>();
            String str = br.readLine();
            boolean disable = false;

            for (int j = 0; j < str.length(); j++) {
                char bracket = str.charAt(j);

                if (bracket == '(') {
                    stack.push('(');
                } else {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    } else {
                        disable = true;
                        break;
                    }
                }
            }

            if (!stack.isEmpty() || disable == true) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
