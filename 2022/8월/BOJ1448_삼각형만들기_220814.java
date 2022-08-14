package algorithm_220814;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class BOJ1448_삼각형만들기_220814 {

    private static int N;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        Integer arr[] = new Integer[N];
        int max = -1;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < N - 2; i++) {
            if (arr[i] < arr[i + 1] + arr[i + 2]) {
                max = Math.max(max, arr[i] + arr[i + 1] + arr[i + 2]);
            }
        }

        System.out.println(max);
    }
}
