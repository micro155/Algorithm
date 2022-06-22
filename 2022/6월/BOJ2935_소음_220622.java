package algorithm_220622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2935_소음_220622 {

    private static String A, B;
    private static String oper;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        A = br.readLine();
        oper = br.readLine();
        B = br.readLine();

        StringBuilder sb = new StringBuilder();

        int max = Math.max(A.length(), B.length());
        int min = Math.min(A.length(), B.length());

        if (oper.charAt(0) == '+') {

            if (max > min) {
                for (int i = 0; i < max - min; i++) {
                    if (i == 0) {
                        sb.append("1");
                    } else {
                        sb.append("0");
                    }
                }

                for (int i = 0; i < min; i++) {
                    if (i == 0) {
                        sb.append("1");
                    } else {
                        sb.append("0");
                    }
                }
            } else {
                for (int i = 0; i < min; i++) {
                    if (i == 0) {
                        sb.append("2");
                    } else {
                        sb.append("0");
                    }
                }
            }

        } else {

            int len = 0;

            if (min == 1) {
                len = max;
            } else {
                len = max + (min - 1);
            }

            for (int i = 0; i < len; i++) {
                if (i == 0) {
                    sb.append("1");
                } else {
                    sb.append("0");
                }
            }
        }

        System.out.println(sb);
    }
}
