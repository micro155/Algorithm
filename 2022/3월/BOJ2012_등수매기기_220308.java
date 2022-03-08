package algorithm_220308;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2012_등수매기기_220308 {

    private static int N;
    private static int arr[];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        long total = 0;
        for (int i = 0; i < N; i++) {
            total += Math.abs((i + 1) - arr[i]);
        }


        System.out.println(total);
    }
}
