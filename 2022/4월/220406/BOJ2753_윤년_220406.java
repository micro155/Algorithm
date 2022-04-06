package algorithm_220406;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2753_윤년_220406 {

    private static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        if (N % 4 == 0 && N % 100 != 0 || N % 400 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
