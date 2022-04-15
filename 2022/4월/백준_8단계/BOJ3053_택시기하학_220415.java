package algorithm_220415;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ3053_택시기하학_220415 {

    private static int N;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        System.out.println(String.format("%.6f", (double) N * N * 3.14159265359));
        System.out.println(String.format("%.6f", (double) N * N * 2));
    }
}
