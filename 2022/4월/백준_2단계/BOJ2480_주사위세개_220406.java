package algorithm_220406;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2480_주사위세개_220406 {

    private static int A, B, C;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        int max = Math.max(A, Math.max(B, C));

        if (A == B && B == C) {
            System.out.println(10000 + A * 1000);
            return;
        }

        if (A == B) {
            System.out.println(1000 + A * 100);
        } else if (A == C) {
            System.out.println(1000 + A * 100);
        } else if (B == C) {
            System.out.println(1000 + B * 100);
        } else {
            System.out.println(max * 100);
        }
    }
}
