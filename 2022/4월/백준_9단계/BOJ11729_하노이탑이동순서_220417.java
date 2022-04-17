package algorithm_220417;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ11729_하노이탑이동순서_220417 {

    private static int N;
    private static int cnt;
    private static StringBuilder sb;


    private static void hanoi(int n, int start, int sub, int end) {

        if (n == 1) {
            cnt++;
            sb.append(start + " " + end).append("\n");
            return;
        }

        hanoi(n - 1, start, end, sub);

        sb.append(start + " " + end).append("\n");
        cnt++;

        hanoi(n - 1, sub, start, end);

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        sb = new StringBuilder();
        cnt = 0;

        hanoi(N, 1, 2, 3);

        System.out.println(cnt);
        System.out.println(sb);
    }
}
