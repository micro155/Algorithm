package algorithm_220908;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ11561_징검다리_220908 {

    private static int T;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < T; tc++) {

            long num = Long.parseLong(br.readLine());

            long ans = (long) Math.sqrt(2 * num);

            if (ans * (ans + 1) / 2 <= num) {
                System.out.println(ans);
            } else {
                System.out.println(ans - 1);
            }
        }
    }
}
