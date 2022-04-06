package algorithm_220406;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2884_알람시계_220406 {

    private static int H, M;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        H = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        if (M - 45 < 0) {
            M += 60 - 45;
            if (H - 1 < 0) {
                H = 23;
            } else {
                H--;
            }
        } else {
            M -= 45;
        }

        System.out.println(H + " " + M);
    }
}
