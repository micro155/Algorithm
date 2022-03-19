package algorithm_220319;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ13116_30번_220319 {

    private static int N;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < N; tc++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int min = Math.min(a, b);

            if (min == a) {
                while (true) {
                    if (b - a < a)
                        break;
                    b /= 2;
                }
            } else {
                while (true) {
                    if (a - b < b)
                        break;
                    a /= 2;
                }
            }

            while (a != b) {
                if (a > b) {
                    a /= 2;
                    if (a == b)
                        break;
                    b /= 2;
                } else {
                    b /= 2;
                    if (b == a)
                        break;
                    a /= 2;
                }
            }

            System.out.println(a * 10);



        }
    }
}
