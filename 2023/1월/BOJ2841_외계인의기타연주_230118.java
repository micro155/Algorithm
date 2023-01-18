package algorithm_230117;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ2841_외계인의기타연주_230118 {

    private static int N, P;
    private static Stack<Integer> stack[];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());

        stack = new Stack[7];

        for (int i = 0; i < 7; i++) {
            stack[i] = new Stack<>();
        }

        int result = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            while (!stack[a].isEmpty() && stack[a].peek() > b) {
                stack[a].pop();
                result++;
            }

            if (stack[a].empty() || (!stack[a].isEmpty() && stack[a].peek() < b)) {
                stack[a].push(b);
                result++;
            }
        }

        System.out.println(result);
    }
}
