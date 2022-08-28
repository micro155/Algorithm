package algorithm_220828;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ1013_Contact_220828 {

    private static int N;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        String pattern = "(100+1+|01)+";

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            if (input.matches(pattern)) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }
        }

        System.out.println(sb);
    }
}
