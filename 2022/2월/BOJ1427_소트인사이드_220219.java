package algorithm_220219;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ1427_소트인사이드_220219 {

    private static Integer arr[];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num_str = br.readLine();
        arr = new Integer[num_str.length()];

        for (int i = 0; i < num_str.length(); i++) {
            arr[i] = Character.getNumericValue(num_str.charAt(i));
        }

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num_str.length(); i++) {
            sb.append(arr[i]);
        }

        System.out.println(sb);

    }
}
