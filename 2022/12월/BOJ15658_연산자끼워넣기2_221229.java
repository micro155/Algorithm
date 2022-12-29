package algorithm_221228;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ15658_연산자끼워넣기2_221229 {

    private static int N, maxResult, minResult, arr[], oper_arr[];

    private static void dfs(int cnt, int sum) {

        if (cnt == N) {
            minResult = Math.min(minResult, sum);
            maxResult = Math.max(maxResult, sum);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (oper_arr[i] == 0)
                continue;
            oper_arr[i]--;
            switch (i) {
                case 0:
                    dfs(cnt + 1, sum + arr[cnt]);
                    break;
                case 1:
                    dfs(cnt + 1, sum - arr[cnt]);
                    break;
                case 2:
                    dfs(cnt + 1, sum * arr[cnt]);
                    break;
                default:
                    dfs(cnt + 1, sum / arr[cnt]);
                    break;
            }
            oper_arr[i]++;
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        maxResult = Integer.MIN_VALUE;
        minResult = Integer.MAX_VALUE;
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        oper_arr = new int[4];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            oper_arr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(1, arr[0]);

        System.out.println(maxResult);
        System.out.println(minResult);
    }
}
