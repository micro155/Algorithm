package algorithm_220425;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ3036_링_220425 {

    private static int N;
    private static int arr[];

    private static int gcd(int a, int b) {

        int c = a % b;

        while (c != 0) {
            a = b;
            b = c;
            c = a % b;
        }

        return b;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < N; i++) {

            int num = gcd(arr[0], arr[i]);

            System.out.println(arr[0] / num + "/" + arr[i] / num);
        }
    }
}
