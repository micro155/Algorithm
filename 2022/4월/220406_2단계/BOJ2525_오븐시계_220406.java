package algorithm_220406;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2525_오븐시계_220406 {

    private static int A, B, C;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(br.readLine());

        if (B + C >= 60) {
            int num = (B + C) / 60;
            B = (B + C) - (60 * num);
            A += num;
            if (A >= 24) {
                A -= 24;
            }
        } else {
            B += C;
        }

        System.out.println(A + " " + B);
    }
}
