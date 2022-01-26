package algorithm_220126;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ9655_돌게임_220126 {

    private static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        if (N % 2 == 1) {
            System.out.println("SK");
        } else {
            System.out.println("CY");
        }
    }
}
