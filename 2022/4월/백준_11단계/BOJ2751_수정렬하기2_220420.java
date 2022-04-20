package algorithm_220420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ2751_수정렬하기2_220420 {

    private static int N;
    private static ArrayList<Integer> arr_list;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr_list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            arr_list.add(num);
        }

        Collections.sort(arr_list);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            sb.append(arr_list.get(i)).append("\n");
        }

        System.out.println(sb);
    }
}
