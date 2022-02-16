package algorithm_220216;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ3085_사탕게임_220216 {

    private static int N;
    private static char arr[][];
    private static int max = 1;

    private static int checkRow(int x) {
        int tmp = 1;
        int res = 1;
        char ch = arr[x][0];

        for (int i = 1; i < N; i++) {
            if (arr[x][i] != ch) {
                ch = arr[x][i];
                res = Math.max(res, tmp);
                tmp = 1;
            } else {
                tmp++;
            }
        }
        return Math.max(res, tmp);
    }

    private static int checkCol(int y) {
        int tmp = 1;
        int res = 1;
        char ch = arr[0][y];

        for (int i = 1; i < N; i++) {
            if (arr[i][y] != ch) {
                ch = arr[i][y];
                res = Math.max(res, tmp);
                tmp = 1;
            } else {
                tmp++;
            }
        }
        return Math.max(res, tmp);
    }


    private static void swap(int x1, int y1, int x2, int y2) {
        char tmp = arr[x1][y1];
        arr[x1][y1] = arr[x2][y2];
        arr[x2][y2] = tmp;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new char[N][N];
        max = 0;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = str.charAt(j);
            }
            max = Math.max(max, checkRow(i));
        }

        for (int i = 0; i < N; i++) {
            max = Math.max(max, checkCol(i));
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j + 1 < N) {
                    swap(i, j, i, j + 1);
                    max = Math.max(max, checkRow(i));
                    max = Math.max(max, checkCol(j));
                    max = Math.max(max, checkCol(j + 1));
                    swap(i, j, i, j + 1);
                }
                if (i + 1 < N) {
                    swap(i, j, i + 1, j);
                    max = Math.max(max, checkRow(i));
                    max = Math.max(max, checkRow(i + 1));
                    max = Math.max(max, checkCol(j));
                    swap(i, j, i + 1, j);
                }
            }
        }

        System.out.println(max);


    }
}
