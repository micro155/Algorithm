package algorithm_220415;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ4153_직각삼각형_220415 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            ArrayList<Integer> arr_list = new ArrayList<>();

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            arr_list.add(a);
            arr_list.add(b);
            arr_list.add(c);

            arr_list.sort(null);

            int max = (int) Math.pow(arr_list.get(arr_list.size() - 1), 2);
            int sum = (int) (Math.pow(arr_list.get(0), 2) + Math.pow(arr_list.get(1), 2));

            if (max == sum) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }

        }
    }
}
