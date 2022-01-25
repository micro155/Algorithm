package algorithm_220124;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2720_세탁소사장동혁_백동열 {

    private static int T;
    private static int arr[][];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());
        arr = new int[T][4];

        for (int tc = 0; tc < T; tc++) {
            int num = Integer.parseInt(br.readLine());

            if (num >= 25) {

                while(25 <= num) {
                    num -= 25;
                    arr[tc][0]++;
                }

            }
            if (num >= 10) {

                while(10 <= num) {
                    num -= 10;
                    arr[tc][1]++;
                }

            }
            if (num >= 5) {

                while(5 <= num) {
                    num -= 5;
                    arr[tc][2]++;
                }

            }
            if (num >= 1) {

                while(1 <= num) {
                    num -= 1;
                    arr[tc][3]++;
                }

            }
        }

        for (int i = 0; i < T; i++) {
            System.out.print(arr[i][0] + " " + arr[i][1] + " " + arr[i][2] + " " + arr[i][3]);
            System.out.println();
        }
    }
}
