package algorithm_220401;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2078_무한이진트리_220401 {

    private static int A, B;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        int x = 0;
        int y = 0;

        while (A > 1 && B > 1) {
            if (A < B) {
                y += B / A;
                B %= A;
            } else if (A > B) {
                x += A / B;
                A %= B;
            }
        }

        x += A - 1;
        y += B - 1;
        System.out.println(x + " " + y);
    }
}
