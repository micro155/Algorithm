package algorithm_220822;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ5598_카이사르암호_220822 {

    private static String input;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input = br.readLine();

        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if ((c - 3) - 'A' < 0) {
                result += (char) (c - 3 + 26);
            } else {
                result += (char) (c - 3);
            }
        }

        System.out.println(result);
    }
}
