package algorithm_220501;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ15649_N과M_1_220501 {

    private static int N, M;
    private static boolean visited[];

    private static void dfs(int cnt, ArrayList<Integer> arr_list) {

        if (cnt == M) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arr_list.size(); i++) {
                sb.append(arr_list.get(i)).append(" ");
            }
            System.out.println(sb);
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (visited[i])
                continue;

            visited[i] = true;
            arr_list.add(i);
            dfs(cnt + 1, arr_list);
            arr_list.remove(arr_list.size() - 1);
            visited[i] = false;
        }

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];

        dfs(0, new ArrayList<>());
    }
}
