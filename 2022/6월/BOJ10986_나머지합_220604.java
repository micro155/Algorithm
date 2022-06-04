package algorithm_220604;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10986_나머지합_220604 {

    private static int N, M;
    private static int other[];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        other = new int[M];
        int sum = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(st.nextToken()) % M;
            other[sum % M]++;
        }

        long result = other[0];
        for (int i = 0; i < M; i++) {
            int n = other[i];
            result += (long) n * (n - 1) / 2;
        }

        System.out.println(result);
    }
}
