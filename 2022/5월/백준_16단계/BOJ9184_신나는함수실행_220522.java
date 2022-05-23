package algorithm_220522;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ9184_신나는함수실행_220522 {

    private static int d[][][];


    private static boolean isRange(int n1, int n2, int n3) {
        return 0 <= n1 && n1 <= 20 && 0 <= n2 && n2 <= 20 && 0 <= n3 && n3 <= 20;
    }

    private static int w(int n1, int n2, int n3) {

        if (isRange(n1, n2, n3) && d[n1][n2][n3] != 0) {
            return d[n1][n2][n3];
        }

        if (n1 <= 0 || n2 <= 0 || n3 <= 0) {
            return 1;
        } else if (n1 > 20 || n2 > 20 || n3 > 20) {
            return d[20][20][20] = w(20, 20, 20);
        } else if (n1 < n2 && n2 < n3) {
            return d[n1][n2][n3] = w(n1, n2, n3 - 1) + w(n1, n2 - 1, n3 - 1) - w(n1, n2 - 1, n3);
        }

        return d[n1][n2][n3] = w(n1 - 1, n2, n3) + w(n1 - 1, n2 - 1, n3) + w(n1 - 1, n2, n3 - 1) - w(n1 - 1, n2 - 1, n3 - 1);
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        d = new int[21][21][21];


        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            int n3 = Integer.parseInt(st.nextToken());

            if (n1 == -1 && n2 == -1 && n3 == -1) {
                break;
            }

            sb.append("w(" + n1 + ", " + n2 + ", " + n3 + ") = ").append(w(n1, n2, n3)).append("\n");
        }

        System.out.println(sb);
    }
}
