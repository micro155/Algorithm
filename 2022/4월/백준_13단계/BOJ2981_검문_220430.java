package algorithm_220430;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2981_검문_220430 {

    private static int N;
    private static int arr[];

    private static int gcd(int a, int b) {

        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }

        return a;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int gcdVal = arr[1] - arr[0];

        for (int i = 2; i < N; i++) {
            gcdVal = gcd(gcdVal, arr[i] - arr[i - 1]);
        }

        for (int i = 2; i <= gcdVal; i++) {
            if (gcdVal % i == 0) {
                System.out.print(i + " ");
            }
        }

    }
}
