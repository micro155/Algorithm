package algorithm_221112;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ16165_걸그룹마스터준석이_221112 {

    private static int N, M;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        HashMap<String, String> map = new HashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String team = br.readLine();
            int nums = Integer.parseInt(br.readLine());

            for (int j = 0; j < nums; j++) {
                sb.append(br.readLine() + " ");
            }
            map.put(team, sb.toString());
            sb.setLength(0);
        }

        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            int n = Integer.parseInt(br.readLine());
            arrayList.clear();

            if (n == 0) {
                st = new StringTokenizer(map.get(input), " ");
                while (st.hasMoreTokens()) {
                    arrayList.add(st.nextToken());
                }
                Collections.sort(arrayList);
                for (int j = 0; j < arrayList.size(); j++) {
                    System.out.println(arrayList.get(j));
                }
            } else {
                Iterator iter = map.keySet().iterator();

                while (iter.hasNext()) {
                    String key = iter.next().toString();
                    st = new StringTokenizer(map.get(key), " ");

                    while (st.hasMoreTokens()) {
                        String name = st.nextToken();
                        if (input.equals(name)) {
                            System.out.println(key);
                        }
                    }
                }
            }
        }
    }
}
