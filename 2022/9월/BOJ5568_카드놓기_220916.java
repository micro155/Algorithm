package algorithm_220916;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BOJ5568_카드놓기_220916 {

    private static int N, K;
    private static int list[], arr[];
    private static boolean visited[];
    private static Set<Integer> set;

    private static void dfs(int cnt) {

        if (cnt == K) {
            String num = "";

            for (int i = 0; i < cnt; i++) {
                num += arr[i];
            }
            set.add(Integer.parseInt(num));
            return;
        }

        for (int i = 0; i < N; i++) {
            if (visited[i])
                continue;
            visited[i] = true;
            arr[cnt] = list[i];
            dfs(cnt + 1);
            visited[i] = false;
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());

        list = new int[N];
        arr = new int[K];
        visited = new boolean[N];
        set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }

        dfs(0);

        System.out.println(set.size());
    }
}
