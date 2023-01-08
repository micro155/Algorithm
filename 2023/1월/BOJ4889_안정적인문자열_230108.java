package algorithm_230108;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ4889_안정적인문자열_230108 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int no = 0;
        while (true) {
            no++;
            String input = br.readLine();

            if (input.contains("-"))
                break;

            int n = input.length();
            int cnt = 0;
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < n; i++) {
                char temp = input.charAt(i);

                if (temp == '{') {
                    stack.add(temp);
                } else {
                    if (stack.isEmpty()) {
                        cnt++;
                        stack.add('{');
                    } else {
                        stack.pop();
                    }
                }
            }

            StringBuilder sb = new StringBuilder();
            sb.append(no).append(". ").append(cnt + stack.size() / 2);
            System.out.println(sb);
        }
    }
}
