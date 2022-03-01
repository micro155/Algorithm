package algorithm_220301;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ15665_N과M_11_220301 {

    private static int N, M;
    private static int arr[];
    private static ArrayList<String> result_list;

    private static void dfs(int num[], int cnt) {

        if (cnt == M) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < num.length; i++) {
                sb.append(num[i]).append(" ");
            }
            result_list.add(String.valueOf(sb));
            return;
        }

        int prev = -1;
        for (int i = 0; i < N; i++) {
            if (prev != arr[i]) {
                prev = arr[i];
                num[cnt] = prev;
                dfs(num, cnt + 1);
            }
        }


    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        result_list = new ArrayList<>();

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        dfs(new int[M], 0);

        for (int i = 0; i < result_list.size(); i++) {
            System.out.println(result_list.get(i));
        }


    }
}
