package algorithm_221024;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ12605_단어순서뒤집기_221024 {

    private static int N;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        String str[] = new String[N];

        for (int i = 0; i < N; i++) {
            str[i] = br.readLine();
            String input[] = str[i].split(" ");
            String reverse_str = "";
            for (int j = input.length - 1; j >= 0; j--) {
                reverse_str += " " + input[j];
            }
            str[i] = reverse_str;
        }

        for (int i = 0; i < N; i++) {
            System.out.println("Case #" + (i + 1) + ":" + str[i]);
        }
    }
}
