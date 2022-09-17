package algorithm_220917;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ13164_행복유치원_220917 {

    private static int N, K, arr[], cost[];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new int[N];
        cost = new int[N - 1];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        for (int i = 1; i < N; i++) {
            cost[i - 1] = arr[i] - arr[i - 1];
        }

        Arrays.sort(cost);

        long result = 0;

        for (int i = 0; i < N - K; i++) {
            result += cost[i];
        }

        System.out.println(result);
    }
}
