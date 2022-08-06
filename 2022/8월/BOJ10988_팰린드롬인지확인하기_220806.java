package algorithm_220806;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ10988_팰린드롬인지확인하기_220806 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        StringBuilder sb = new StringBuilder(input);
        if (input.equals(sb.reverse().toString())) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
