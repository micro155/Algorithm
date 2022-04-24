package algorithm_220424;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2609_최대공약수와최소공배수_220423 {

    private static int N, M;

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

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        System.out.println(gcd(N, M));
        System.out.println(lcm(N, M));
    }
}
