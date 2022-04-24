package algorithm_220424;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1934_최소공배수_220424 {

    private static int T, A, B;

    private static int gcd(int a, int b) {

        int c = a % b;

        while (c != 0) {
            a = b;
            b = c;
            c = a % b;
        }

        return b;
    }

    private static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            System.out.println(lcm(A, B));
        }
    }
}
