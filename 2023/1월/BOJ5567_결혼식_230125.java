package algorithm_230125;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ5567_결혼식_230125 {

    private static int N, M;
    private static ArrayList<Integer> arrayList[];
    private static boolean visited[];

    private static void dfs(int num, ArrayList<Integer>[] lists, int depth) {
        if (depth == 2) {
            return;
        }

        for (int i = 0; i < lists[num].size(); i++) {
            int next = lists[num].get(i);
            visited[next] = true;
            dfs(next, lists, depth + 1);
        }

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        arrayList = new ArrayList[N + 1];

        for (int i = 0; i <= N; i++) {
            arrayList[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arrayList[a].add(b);
            arrayList[b].add(a);
        }

        visited = new boolean[N + 1];
        visited[1] = true;
        dfs(1, arrayList, 0);

        int result = 0;
        for (int i = 2; i <= N; i++) {
            if (visited[i])
                result++;
        }

        System.out.println(result);
    }
}
