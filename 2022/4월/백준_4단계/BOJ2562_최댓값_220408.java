package algorithm_220408;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2562_최댓값_220408 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int index = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 9; i++) {
            int num = Integer.parseInt(br.readLine());
            if (max < num) {
                max = num;
                index = i;
            }
        }

        System.out.println(max);
        System.out.println(index + 1);
    }
}
