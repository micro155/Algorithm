package algorithm_220415;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1002_터렛_220415 {

    private static int N;

    private static int findPoint(int x1, int y1, int r1, int x2, int y2, int r2) {
        int dis_pow = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if (x1 == x2 && y1 == y2 && r1 == r2) {
            return -1;
        } else if (dis_pow > Math.pow(r1 + r2, 2)) {
            return 0;
        } else if (dis_pow < Math.pow(r2 - r1, 2)) {
            return 0;
        } else if (dis_pow == Math.pow(r2 - r1, 2)) {
            return 1;
        } else if (dis_pow == Math.pow(r1 + r2, 2)) {
            return 1;
        } else {
            return 2;
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < N; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            
            int num = findPoint(x1, y1, r1, x2, y2, r2);

            System.out.println(num);
        }
    }
}
