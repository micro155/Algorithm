package algorithm_230206;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ15666_N과M_12_230206 {

    private static int N, M, arr[], result[];

    private static void dfs(int cnt, int start) {

        if (cnt == M) {
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
            return;
        }

        int prev_num = -1;

        for (int i = start; i < N; i++) {

            if (prev_num != arr[i]) {
                result[cnt] = arr[i];
                prev_num = arr[i];
                dfs(cnt + 1, i);
            }
        }

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];

        result = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        dfs(0, 0);


    }
}
