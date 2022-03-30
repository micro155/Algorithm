package algorithm_220330;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ1302_베스트셀러_220330 {

    private static int N;


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }

        List<Map.Entry<String, Integer>> mapList = new LinkedList<>(map.entrySet());
        mapList.sort((o1, o2) -> o2.getValue() - o1.getValue());


        System.out.println(mapList.get(0).getKey());
    }
}
