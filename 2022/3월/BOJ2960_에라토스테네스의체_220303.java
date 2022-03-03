package algorithm_220303;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ2960_에라토스테네스의체_220303 {

    private static int N, K;
    private static ArrayList<Integer> arr_list;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr_list = new ArrayList<>();

        int min = 2;
        for (int i = 2; i <= N; i++) {
            arr_list.add(i);
        }

        int cnt = 0;
        int result = 0;

        while (cnt != K) {

            for (int i = 0; i < arr_list.size(); i++) {
                if (arr_list.get(i) % min == 0) {
                    result = arr_list.get(i);
                    arr_list.remove(i);
                    cnt++;
                }
                if (cnt == K) {
                    break;
                }
            }

            if (arr_list.size() > 0) {
                min = arr_list.get(0);
            }

        }

        System.out.println(result);
    }
}
