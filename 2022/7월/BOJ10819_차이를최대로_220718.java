package algorithm_220718;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10819_차이를최대로_220718 {

    private static int N, arr[], temp[], result;
    private static boolean visited[];

    private static void permutation(int cnt) {

        if (cnt == N) {
            int sum = 0;
            for (int i = 1; i < N; i++) {
                sum += Math.abs(temp[i - 1] - temp[i]);
            }
            if (sum > result) {
                result = sum;
            }
            return;
        }

        for (int i = 0; i < N; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            temp[cnt] = arr[i];
            permutation(cnt + 1);
            visited[i] = false;
        }

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        temp = new int[N];
        visited = new boolean[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        permutation(0);

        System.out.println(result);


    }
}
