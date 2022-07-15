package algorithm_220715;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ11655_ROT13_220715 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c >= 'a' && c <= 'z') {
                char changedChar = (char) ('a' + (c - 'a' + 13) % 26);
                sb.append(changedChar);
            } else if (c >= 'A' && c <= 'Z') {
                char changedChar = (char) ('A' + (c - 'A' + 13) % 26);
                sb.append(changedChar);
            } else {
                sb.append(c);
            }
        }

        System.out.println(sb);
    }
}
