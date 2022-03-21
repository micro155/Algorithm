package algorithm_220321;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ15664_N과M_10_220321 {

    private static int N, M;
    private static int arr[];
    private static int result[];
    private static boolean visited[];

    private static void dfs(int index, int cnt, StringBuilder sb) {

        if (cnt == M) {
            for (int i = 0; i < M; i++) {
                sb.append(result[i]).append(" ");
            }
            return;
        }

        int num = 0;
        for (int i = index; i < N; i++) {
            if (!visited[i]) {
                if (num == arr[i]) {
                    continue;
                }

                visited[i] = true;
                result[cnt] = arr[i];
                dfs(i + 1, cnt + 1, sb);
                visited[i] = false;
                num = arr[i];
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
        visited = new boolean[N + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        dfs(0, 0, sb);

        System.out.println(sb);
    }
}
