package algorithm_230110;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ9657_돌게임3_230110 {

    private static int N;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        System.out.println((N % 7 == 0 || N % 7 == 2) ? "CY" : "SK");
    }
}
