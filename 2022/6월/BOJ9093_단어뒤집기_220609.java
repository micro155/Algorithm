package algorithm_220609;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ9093_단어뒤집기_220609 {

    private static int N;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();

            while (st.hasMoreTokens()) {
                String input = st.nextToken();

                String result = "";
                for (int j = input.length() - 1; j >= 0; j--) {
                    result += input.charAt(j);
                }

                sb.append(result).append(" ");
            }

            System.out.println(sb);
        }
    }
}
