package algorithm_220607;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1629_곱셈_220607 {

    private static int A, B, C;

    private static long pow(long num, int exp) {

        if (exp == 1) {
            return A % C;
        }

        long temp = pow(A, exp / 2);

        if (exp % 2 == 1) {
            return (temp * temp % C) * A % C;
        }
        return temp * temp % C;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        long result = pow(A, B);

        System.out.println(result);

    }
}
