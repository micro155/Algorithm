package algorithm_220403;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ1254_팰린드롬만들기_220403 {

    private static String input;
    private static int length;

    private static boolean palindrome(int index) {

        for (int i = 0; index + i < length - i - 1; i++) {
            if (input.charAt(index + i) != input.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        input = br.readLine();
        length = input.length();
        int answer = 0;

        for (int i = 0; i < length; i++) {
            if (palindrome(i)) {
                answer = length + i;
                break;
            }
        }

        System.out.println(answer);

    }
}
