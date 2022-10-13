package algorithm_221013;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ18406_럭키스트레이트_221013 {


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int sum = 0;
        for (int i = 0; i < input.length() / 2; i++) {
            char c = input.charAt(i);
            sum += c - '0';
        }
        for (int i = input.length() / 2; i < input.length(); i++) {
            char c = input.charAt(i);
            sum -= c - '0';
        }

        if (sum == 0) {
            System.out.println("LUCKY");
        } else {
            System.out.println("READY");
        }
    }
}
