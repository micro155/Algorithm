package algorithm_220420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ2750_수정렬하기_220420 {

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

        arr_list.sort(null);

        for (int i = 0; i < arr_list.size(); i++) {
            System.out.println(arr_list.get(i));
        }
    }
}
