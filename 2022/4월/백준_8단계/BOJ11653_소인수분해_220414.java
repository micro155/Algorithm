package algorithm_220414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ11653_소인수분해_220414 {

    private static int N;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        int div = 2;

        if (N != 1) {
            while (N > 1) {
                if (N % div == 0) {
                    System.out.println(div);
                    N /= div;
                } else {
                    div++;
                }
            }
        }


    }
}
