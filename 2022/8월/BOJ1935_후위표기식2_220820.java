package algorithm_220820;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ1935_후위표기식2_220820 {

    private static int N;
    private static double num[];
    private static Stack<Double> stack;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        num = new double[N];
        stack = new Stack<>();

        String input = br.readLine();

        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                double a = stack.pop();
                double b = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(b + a);
                        break;
                    case '-':
                        stack.push(b - a);
                        break;
                    case '*':
                        stack.push(b * a);
                        break;
                    case '/':
                        stack.push(b / a);
                        break;
                }
            } else {
                stack.push(num[c - 'A']);
            }
        }

        double result = stack.pop();

        System.out.println(String.format("%.2f", result));
    }
}
