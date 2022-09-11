package algorithm_220911;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class BOJ5397_키로거_220911 {

    private static int T;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < T; tc++) {
            Stack<Character> result = new Stack<>();
            Stack<Character> temp = new Stack<>();

            String input = br.readLine();

            for (int i = 0; i < input.length(); i++) {
                char cur = input.charAt(i);

                if (cur == '<') {
                    if (!result.isEmpty()) {
                        temp.push(result.pop());
                    }
                } else if (cur == '>') {
                    if (!temp.isEmpty()) {
                        result.push(temp.pop());
                    }
                } else if (cur == '-') {
                    if (!result.isEmpty())
                        result.pop();
                } else {
                    result.push(cur);
                }
            }

            while (!temp.isEmpty()) {
                result.push(temp.pop());
            }

            StringBuilder sb = new StringBuilder();


            for (int i = 0; i < result.size(); i++) {
                sb.append(result.get(i));
            }

            System.out.println(sb);
        }
        br.close();
    }
}
