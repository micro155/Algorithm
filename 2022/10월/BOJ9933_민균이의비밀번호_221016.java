package algorithm_221016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ9933_민균이의비밀번호_221016 {

    private static int N;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        ArrayList<String> arr_list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            arr_list.add(br.readLine());
        }

        for (int i = 0; i < N; i++) {
            String str = arr_list.get(i);
            String reverseStr = new StringBuffer(str).reverse().toString();
            if (arr_list.contains(reverseStr) || str.equals(reverseStr)) {
                System.out.println(str.length() + " " + str.charAt(str.length() / 2));
                return;
            }
        }
    }
}
