package algorithm_220410;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ1157_단어공부_220410 {

    private static String input;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        input = br.readLine().toLowerCase();
        int arr[] = new int[26];

        char max_c = '?';


        for (int i = 0; i < input.length(); i++) {
            if ('A' <= input.charAt(i) && input.charAt(i) <= 'Z') {
                arr[input.charAt(i) - 'A']++;
            } else {
                arr[input.charAt(i) - 'a']++;
            }
        }

        int max = -1;
        char ch = '?';

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65);
            } else if (arr[i] == max) {
                ch = '?';
            }
        }

        System.out.println(ch);

    }
}
