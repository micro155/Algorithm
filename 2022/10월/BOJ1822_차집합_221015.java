package algorithm_221015;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ1822_차집합_221015 {

    private static int A, B;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        TreeSet<Integer> a_set = new TreeSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A; i++) {
            a_set.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < B; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (a_set.contains(num)) {
                a_set.remove(num);
            }
        }

        if (a_set.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(a_set.size());
            StringBuilder sb = new StringBuilder();
            for (Integer num : a_set) {
                sb.append(num).append(" ");
            }
            System.out.println(sb);
        }
    }
}
