package algorithm_220405;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2588_곱셈_220405 {

    private static int N;
    private static String M;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        M = br.readLine();

        int sum = 0;
        int cnt = 0;
        for (int i = M.length() - 1; i >= 0; i--) {
            int num = N * Integer.parseInt(String.valueOf(M.charAt(i)));
            System.out.println(num);
            sum += num * Math.pow(10, cnt);
            cnt++;
        }
        System.out.println(sum);
    }
}
