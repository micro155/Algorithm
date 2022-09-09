package algorithm_220909;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ12891_DNA비밀번호_220909 {

    private static int S, P;
    private static String input;
    private static HashMap<Character, int[]> map;
    private static char dna[] = {'A', 'C', 'G', 'T'};

    private static boolean available() {
        for (char c : dna) {
            if (map.get(c)[0] < map.get(c)[1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        S = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());

        input = br.readLine();
        map = new HashMap<>();
        int result = 0;

        st = new StringTokenizer(br.readLine());

        for (char c : dna) {
            map.put(c, new int[]{0, Integer.parseInt(st.nextToken())});
        }

        for (int i = 0; i < P; i++) {
            map.get(input.charAt(i))[0]++;
        }
        if (available())
            result++;

        for (int i = 0; i < S - P; i++) {
            map.get(input.charAt(i))[0] -= 1;
            map.get(input.charAt(i + P))[0] += 1;
            if (available())
                result++;
        }


        System.out.println(result);
    }
}
