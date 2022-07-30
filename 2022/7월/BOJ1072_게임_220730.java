package algorithm_220730;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1072_게임_220730 {

    private static int X, Y, Z;

    private static int getPercent(int x, int y) {
        return (int) ((long) y * 100 / x);
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());
        Z = getPercent(X, Y);

        int ans = -1;
        int start = 0;
        int end = (int) 1e9;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (getPercent(X + mid, Y + mid) != Z) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.println(ans);

    }
}
