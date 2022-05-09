package algorithm_220509;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ1620_나는야포켓몬마스터이다솜_220509 {

    private static int N, M;
    private static String[] names;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        names = new String[N];
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            names[i] = str;
            map.put(str, i + 1);
        }

        for (int i = 0; i < M; i++) {
            String input = br.readLine();

            if (input.charAt(0) - 'A' >= 0) {
                System.out.println(map.get(input));
            } else {
                System.out.println(names[Integer.parseInt(input) - 1]);
            }
        }
    }
}
