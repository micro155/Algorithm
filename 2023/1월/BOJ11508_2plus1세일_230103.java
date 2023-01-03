package algorithm_230103;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class BOJ11508_2plus1세일_230103 {


    private static int N;
    private static Integer arr[];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new Integer[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr, Collections.reverseOrder());

        int idx = 0;
        int sum = 0;

        while (idx < arr.length) {
            int cnt = 0;
            for (int i = idx; i < arr.length; i++) {
                idx++;
                cnt++;
                if (cnt == 3) {
                    break;
                } else {
                    sum += arr[i];
                }
            }
        }

        System.out.println(sum);

    }
}
