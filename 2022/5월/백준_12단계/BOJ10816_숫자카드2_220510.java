package algorithm_220510;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ10816_숫자카드2_220510 {

    private static int N, M;
    private static Map<Integer, Integer> map;
    private static Set<Integer> set;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        map = new HashMap<>();
        set = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (set.contains(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                set.add(num);
                map.put(num, 1);
            }

        }

        M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (set.contains(num)) {
                sb.append(map.get(num)).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }

        System.out.println(sb);
    }
}
