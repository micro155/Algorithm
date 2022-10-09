package algorithm_221010;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ15904_UCPC는무엇의약자일까_221011 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String str = "UCPC";

        int cnt = 0;
        for (char c : input.toCharArray()) {
            if (c == str.charAt(cnt)) {
                cnt++;
                if (cnt == 4)
                    break;
            }
        }

        if (cnt == 4) {
            System.out.println("I love UCPC");
        } else {
            System.out.println("I hate UCPC");
        }
    }
}
