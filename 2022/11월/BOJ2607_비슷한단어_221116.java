package algorithm_221116;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2607_비슷한단어_221116 {

    private static int N;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine()) - 1;

        String first_str = br.readLine();
        int len = first_str.length();
        int alphabet[] = new int[26];

        for (int i = 0; i < len; i++) {
            alphabet[first_str.charAt(i) - 'A']++;
        }

        int result = 0;

        while (N-- > 0) {
            int[] temp = alphabet.clone();
            String comp = br.readLine();
            int cnt = 0;
            for (int i = 0; i < comp.length(); i++) {
                if (temp[comp.charAt(i) - 'A'] > 0) {
                    cnt++;
                    temp[comp.charAt(i) - 'A']--;
                }
            }
            if (len - 1 == comp.length() && cnt == comp.length()) {
                result++;
            } else if (len == comp.length()) {
                if (cnt == len || cnt == len - 1) result++;
            } else if (len + 1 == comp.length()) {
                if (cnt == len) result++;
            }
        }

        System.out.println(result);
    }
}
