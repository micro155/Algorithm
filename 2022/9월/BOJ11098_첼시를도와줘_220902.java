package algorithm_220902;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11098_첼시를도와줘_220902 {

    private static int N;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int tc = 0; tc < N; tc++) {

            long max = Long.MIN_VALUE;
            String topPerson = "";

            int num = Integer.parseInt(br.readLine());

            for (int i = 0; i < num; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                long salary = Long.parseLong(st.nextToken());
                String name = st.nextToken();

                if (salary > max) {
                    max = salary;
                    topPerson = name;
                }
            }

            sb.append(topPerson).append('\n');
        }

        System.out.println(sb);
    }
}
