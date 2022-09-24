package algorithm_220924;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ14490_백대열_220924 {

    private static int GCD(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return GCD(b, a % b);
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        String nums[] = input.split(":");

        int a = Integer.parseInt(nums[0]);
        int b = Integer.parseInt(nums[1]);

        int gcd = GCD(Math.max(a, b), Math.min(a, b));

        System.out.println(a / gcd + ":" + b / gcd);
    }
}
