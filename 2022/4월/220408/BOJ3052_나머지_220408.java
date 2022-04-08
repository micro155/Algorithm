package algorithm_220408;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BOJ3052_나머지_220408 {

    private static Set<Integer> set;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        set = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int input = Integer.parseInt(br.readLine());
            int num = input % 42;

            if (!set.contains(num)) {
                set.add(num);
            }
        }

        System.out.println(set.size());
    }
}
