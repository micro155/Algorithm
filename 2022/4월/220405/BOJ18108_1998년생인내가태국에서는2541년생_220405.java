package algorithm_220405;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ18108_1998년생인내가태국에서는2541년생_220405 {

    private static int N;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        System.out.println(N - 543);
    }
}
