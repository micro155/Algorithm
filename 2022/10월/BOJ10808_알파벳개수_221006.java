package algorithm_221006;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ10808_알파벳개수_221006 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();

        int alphabet[] = new int[26];

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            int diff = c - 'a';
            alphabet[diff]++;
        }

        for (int i = 0; i < 26; i++) {
            sb.append(alphabet[i]).append(" ");
        }

        System.out.println(sb);
    }
}
