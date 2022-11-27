package algorithm_221127;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ9996_한국이그리울땐서버에접속하지_221127 {

    private static int N;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        String regex = "^" + br.readLine().replaceAll("\\*", ".*") + "$", str = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            str = br.readLine();

            if (str.matches(regex)) {
                sb.append("DA").append("\n");
            } else {
                sb.append("NE").append("\n");
            }
        }

        System.out.println(sb);

    }
}
