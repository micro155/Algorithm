package algorithm_220807;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ17608_막대기_220807 {

    private static int N, arr[];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int min = arr[arr.length - 1];
        int cnt = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (min < arr[i]) {
                min = arr[i];
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
