package algorithm_220426;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2004_조합0의개수_220426 {

    private static long N, M;


    private static long five(long num) {

        int cnt = 0;
        while (num >= 5) {
            cnt += num / 5;
            num /= 5;
        }

        return cnt;
    }

    private static long two(long num) {
        int cnt = 0;

        while (num >= 2) {
            cnt += num / 2;
            num /= 2;
        }

        return cnt;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        long n = five(N) - five(N - M) - five(M);
        long m = two(N) - two(N - M) - two(M);

        System.out.println(Math.min(n, m));

    }
}
