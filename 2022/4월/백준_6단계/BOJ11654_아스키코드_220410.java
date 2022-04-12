package algorithm_220410;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ11654_아스키코드_220410 {

    private static String input;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        input = br.readLine();

        System.out.println((int) input.charAt(0));

    }
}
