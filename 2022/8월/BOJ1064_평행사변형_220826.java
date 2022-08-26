package algorithm_220826;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1064_평행사변형_220826 {

    private static Coordinate arr[];

    private static class Coordinate {
        int x;
        int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static double getLength(Coordinate ca, Coordinate cb) {
        double x = ca.x - cb.x;
        double y = ca.y - cb.y;
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    private static double maxValue(double a, double b, double c) {
        if (a < b && a < c) {
            return (b + c) * 2;
        } else if (b < a && b < c) {
            return (a + c) * 2;
        } else {
            return (a + b) * 2;
        }
    }

    private static double minValue(double a, double b, double c) {
        if (a > b && a > c) {
            return (b + c) * 2;
        } else if (b > a && b > c) {
            return (a + c) * 2;
        } else {
            return (a + b) * 2;
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr = new Coordinate[3];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 3; i++) {
            arr[i] = new Coordinate(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        if ((arr[0].y - arr[2].y) * (arr[0].x - arr[1].x) == (arr[0].y - arr[1].y) * (arr[0].x - arr[2].x)) {
            System.out.println("-1.0");
        } else {
            double ablen = getLength(arr[0], arr[1]);
            double bclen = getLength(arr[1], arr[2]);
            double aclen = getLength(arr[2], arr[0]);

            double result = maxValue(ablen, bclen, aclen) - minValue(ablen, bclen, aclen);

            System.out.println(String.format("%.16f", result));
        }


    }
}
