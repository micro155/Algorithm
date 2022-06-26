package algorithm_220626;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ10987_모음의개수_220626 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
                sum++;
            }
        }

        System.out.println(sum);
    }
}
