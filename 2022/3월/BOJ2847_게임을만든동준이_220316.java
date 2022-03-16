package algorithm_220316;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ2847_게임을만든동준이_220316 {


    private static int N;
    private static int arr[];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int sum = 0;
        int pre = N - 1;
        for (int i = N - 2; i >= 0; i--) {
            if (arr[pre] <= arr[i]) {
                int diff = arr[i] - arr[pre];
                sum += diff + 1;
                arr[i] -= (diff + 1);
            }
            pre = i;
        }

        System.out.println(sum);
    }
}
