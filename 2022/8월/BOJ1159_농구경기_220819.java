package algorithm_220819;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ1159_농구경기_220819 {

    private static int N, arr[];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[26];

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            arr[input.charAt(0) - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        boolean check = false;

        for (int i = 0; i < 26; i++) {
            if (arr[i] >= 5) {
                check = true;
                sb.append((char) ('a' + i));
            }
        }

        if (check) {
            System.out.println(sb);
        } else {
            System.out.println("PREDAJA");
        }
    }
}
