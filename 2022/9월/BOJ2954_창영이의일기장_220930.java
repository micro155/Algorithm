package algorithm_220930;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2954_창영이의일기장_220930 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        String replaceStr[] = {"apa", "epe", "ipi", "opo", "upu"};
        String alphabet[] = {"a", "e", "i", "o", "u"};

        for (int i = 0; i < 5; i++) {
            input = input.replaceAll(replaceStr[i], alphabet[i]);
        }

        System.out.println(input);
    }
}
