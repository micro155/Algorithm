package algorithm_220504;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ15652_N과M_4_220504 {

    private static int N, M;
    private static Set<StringBuilder> set;

    private static void dfs(int cnt, ArrayList<Integer> arrayList) {

        if (cnt == M) {
            StringBuilder sb = new StringBuilder();
            int prev = 0;
            boolean check = false;
            for (int i = 0; i < M; i++) {
                if (i == 0) {
                    prev = arrayList.get(i);
                } else {
                    if (prev > arrayList.get(i)) {
                        check = true;
                        break;
                    } else {
                        prev = arrayList.get(i);
                    }
                }
                sb.append(arrayList.get(i)).append(" ");
            }
            if (!check) {
                if (!set.contains(sb)) {
                    set.add(sb);
                    System.out.println(sb);
                }
            }
            return;
        }

        for (int i = 1; i <= N; i++) {
            arrayList.add(i);
            dfs(cnt + 1, arrayList);
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        set = new HashSet<>();

        dfs(0, new ArrayList<>());
    }

}
