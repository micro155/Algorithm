package algorithm_220324;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ10804_카드역배치_220324 {


    private static int arr[];
    private static ArrayList<Integer> arr_list;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        arr = new int[21];

        for (int i = 1; i <= 20; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < 10; i++) {

            arr_list = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            for (int j = start; j <= end; j++) {
                arr_list.add(arr[j]);
            }
            for (int j = arr_list.size() - 1; j >= 0; j--) {
                arr[end - j] = arr_list.get(j);
            }
        }

        for (int i = 1; i <= 20; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
