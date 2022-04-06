package algorithm_220406;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ9498_시험성적_220406 {

    private static int N;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        if (N >= 90 && N <= 100) {
            System.out.println("A");
        } else if (N >= 80 && N <= 89) {
            System.out.println("B");
        } else if (N >= 70 && N <= 79) {
            System.out.println("C");
        } else if (N >= 60 && N <= 69) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
