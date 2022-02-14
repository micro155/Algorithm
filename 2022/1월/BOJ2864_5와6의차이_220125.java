package algorithm_220125;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2864_5와6의차이_220125 {

    private static String A;
    private static String B;
    private static int max;
    private static int min;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        max = 0;
        min = 0;

        A = st.nextToken();
        B = st.nextToken();

        String a_min = "";
        String a_max = "";
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '6') {
                a_min += "5";
            } else {
                a_min += A.charAt(i);
            }
            if (A.charAt(i) == '5') {
                a_max += "6";
            } else {
                a_max += A.charAt(i);
            }
        }

        String b_min = "";
        String b_max = "";
        for (int i = 0; i < B.length(); i++) {
            if (B.charAt(i) == '6') {
                b_min += "5";
            } else {
                b_min += B.charAt(i);
            }
            if (B.charAt(i) == '5') {
                b_max += "6";
            } else {
                b_max += B.charAt(i);
            }
        }

        min = Integer.parseInt(a_min) + Integer.parseInt(b_min);
        max = Integer.parseInt(a_max) + Integer.parseInt(b_max);

        System.out.print(min + " " + max);
        System.out.println();
    }
}
