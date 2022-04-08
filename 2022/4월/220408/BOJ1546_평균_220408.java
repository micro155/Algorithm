package algorithm_220408;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1546_평균_220408 {

    private static int N;
    private static double arr[];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new double[N];
        int max = Integer.MIN_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            max = Math.max(max, num);
            arr[i] = num;
        }

        double sum = 0;

        for (int i = 0; i < N; i++) {
            sum += (arr[i] / max) * 100;
        }


        System.out.println(sum / N);
    }
}
