package algorithm_220523;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ16139_인간컴퓨터상호작용_220523 {

    private static String input;
    private static int sum[][];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        input = br.readLine();

        sum = new int[input.length()][26];

        sum[0][input.charAt(0) - 'a']++;

        for (int i = 1; i < input.length(); i++) {
            int tmp = input.charAt(i) - 'a';

            for (int j = 0; j < 26; j++) {
                sum[i][j] = sum[i - 1][j];
            }
            sum[i][tmp]++;
        }

        int q = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < q; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            char c = st.nextToken().charAt(0);
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            if (start == 0) {
                sb.append(sum[end][c - 'a']).append("\n");
            } else {
                sb.append(sum[end][c - 'a'] - sum[start - 1][c - 'a']).append("\n");
            }
        }

        System.out.println(sb);
    }
}
