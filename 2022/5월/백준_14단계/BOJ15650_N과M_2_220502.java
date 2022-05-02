package algorithm_220502;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ15650_N과M_2_220502 {

    private static int N, M;
    private static boolean visited[];
    private static Set<Set<Integer>> set;

    private static void dfs(int cnt, ArrayList<Integer> arr_list) {
        if (cnt == M) {
            StringBuilder sb = new StringBuilder();
            Set<Integer> temp_set = new HashSet<>();
            for (int i = 0; i < arr_list.size(); i++) {
                sb.append(arr_list.get(i)).append(" ");
                temp_set.add(arr_list.get(i));
            }
            if (!set.contains(temp_set)) {
                set.add(temp_set);
                System.out.println(sb);
            }
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
        set = new HashSet<>();

        dfs(0, new ArrayList<>());
    }
}
