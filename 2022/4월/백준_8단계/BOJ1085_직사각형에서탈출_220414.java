package algorithm_220414;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1085_직사각형에서탈출_220414 {

    private static int x, y, w, h;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        int x_min = Math.min(x - 0, w - x);
        int y_min = Math.min(y - 0, h - y);

        System.out.println(Math.min(x_min, y_min));

    }
}
