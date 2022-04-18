package algorithm_220418;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2798_블랙잭_220418 {

    private static int N, M;
    private static int arr[];
    private static boolean visited[];
    private static int result;
    private static int min;

    private static void bruteForce(int sum, int cnt) {

        if (cnt == 3) {
            if (sum > M) {
                return;
            } else {
                int diff = M - sum;
                if (min >= diff) {
                    min = diff;
                    result = sum;
                }
                return;
            }
        }

        for (int i = 0; i < N; i++) {
            if (visited[i]) {
                continue;
            }

            visited[i] = true;
            bruteForce(sum + arr[i], cnt + 1);
            visited[i] = false;
        }

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        result = 0;
        min = Integer.MAX_VALUE;

        arr = new int[N];
        visited = new boolean[N];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        bruteForce(0, 0);

        System.out.println(result);
    }
}
