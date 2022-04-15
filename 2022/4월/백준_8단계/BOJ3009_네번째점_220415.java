package algorithm_220415;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ3009_네번째점_220415 {

    private static int N, M;


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, Integer> a_map = new HashMap<>();
        Map<Integer, Integer> b_map = new HashMap<>();

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a_map.containsKey(a)) {
                a_map.put(a, a_map.get(a) + 1);
            } else {
                a_map.put(a, 1);
            }

            if (b_map.containsKey(b)) {
                b_map.put(b, b_map.get(b) + 1);
            } else {
                b_map.put(b, 1);
            }
        }

        int a = 0;
        int b = 0;

        Iterator<Integer> Akeys = a_map.keySet().iterator();
        while (Akeys.hasNext()) {
            Integer key = Akeys.next();
            if (a_map.get(key) == 1) {
                a = key;
            }
        }
        Iterator<Integer> Bkeys = b_map.keySet().iterator();
        while (Bkeys.hasNext()) {
            Integer key = Bkeys.next();
            if (b_map.get(key) == 1) {
                b = key;
            }
        }

        System.out.println(a + " " + b);
    }
}
