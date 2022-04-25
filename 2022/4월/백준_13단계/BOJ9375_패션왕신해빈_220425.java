package algorithm_220425;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ9375_패션왕신해빈_220425 {

    private static int T;
    private static int N;
    private static int result;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {

            N = Integer.parseInt(br.readLine());
            result = 0;
            HashMap<String, Integer> hashMap = new HashMap<>();

            while (N-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String type = st.nextToken();

                if (hashMap.containsKey(type)) {
                    hashMap.put(type, hashMap.get(type) + 1);
                } else {
                    hashMap.put(type, 1);
                }
            }

            int result = 1;

            for (int values : hashMap.values()) {
                result *= (values + 1);
            }

            System.out.println(result - 1);
        }
    }
}
