package algorithm_220721;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ1213_팰린드롬만들기_220721 {
    
    private static int arr[];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        arr = new int[26];

        String input = br.readLine();

        for (int i = 0; i < input.length(); i++) {
            arr[input.charAt(i) - 'A']++;
        }

        int cnt = 0;
        int center = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[i] % 2 == 1) {
                center = i;
                cnt++;
            }
        }

        if (cnt > 1 || (cnt == 1 && input.length() % 2 == 0)) {
            System.out.print("I'm Sorry Hansoo");
            return;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < arr[i] / 2; j++) {
                sb.append((char) (i + 'A'));
            }
        }

        StringBuilder sbReverse = new StringBuilder(sb.toString());
        if (cnt == 1)
            sb.append((char) (center + 'A'));
        System.out.println(sb.toString() + sbReverse.reverse());

    }


}
