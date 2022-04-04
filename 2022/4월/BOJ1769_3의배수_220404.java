package algorithm_220404;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ1769_3의배수_220404 {

    private static String num;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        num = br.readLine();
        int cnt = 0;

        while (num.length() > 1) {

            int sum = 0;
            for (int i = 0; i < num.length(); i++) {
                sum += Integer.parseInt(String.valueOf(num.charAt(i)));
            }
            cnt++;

            num = String.valueOf(sum);
        }

        System.out.println(cnt);
        if (Integer.parseInt(String.valueOf(num)) % 3 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
