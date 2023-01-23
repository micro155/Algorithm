package algorithm_230123;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ15656_N과M_7_230123 {

    private static int N, M, arr[];
    private static StringBuilder sb;

    private static void dfs(int cnt, int list[]) {

        if (cnt == M) {
            for (int i = 0; i < M; i++) {
                sb.append(list[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            list[cnt] = arr[i];
            dfs(cnt + 1, list);
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        for (int i = 0; i < N; i++) {
            int list[] = new int[M];
            list[0] = arr[i];
            dfs(1, list);
        }

        System.out.println(sb);
    }
}
