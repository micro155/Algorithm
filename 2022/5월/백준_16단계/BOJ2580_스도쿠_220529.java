package algorithm_220529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2580_스도쿠_220529 {

    private static int arr[][] = new int[9][9];

    private static boolean possible(int x, int y, int value) {

        for (int i = 0; i < 9; i++) {
            if (arr[x][i] == value) {
                return false;
            }
        }

        for (int i = 0; i < 9; i++) {
            if (arr[i][y] == value) {
                return false;
            }
        }

        int cur_x = (x / 3) * 3;
        int cur_y = (y / 3) * 3;

        for (int i = cur_x; i < cur_x + 3; i++) {
            for (int j = cur_y; j < cur_y + 3; j++) {
                if (arr[i][j] == value) {
                    return false;
                }
            }
        }

        return true;
    }

    private static void sudoku(int x, int y) {
        if (y == 9) {
            sudoku(x + 1, 0);
            return;
        }

        if (x == 9) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

            System.exit(0);
        }

        if (arr[x][y] == 0) {
            for (int i = 1; i <= 9; i++) {
                if (possible(x, y, i)) {
                    arr[x][y] = i;
                    sudoku(x, y + 1);
                }
            }
            arr[x][y] = 0;
            return;
        }
        sudoku(x, y + 1);

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        sudoku(0, 0);

    }
}
