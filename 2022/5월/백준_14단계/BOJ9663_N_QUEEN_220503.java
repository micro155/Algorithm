package algorithm_220503;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ9663_N_QUEEN_220503 {

    private static int N;
    private static int arr[];
    private static int cnt;

    private static void nQueen(int depth) {
        if (depth == N) {
            cnt++;
            return;
        }

        for (int i = 0; i < N; i++) {
            arr[depth] = i;
            if (Possibility(depth)) {
                nQueen(depth + 1);
            }
        }
    }

    private static boolean Possibility(int col) {

        for (int i = 0; i < col; i++) {
            if (arr[col] == arr[i]) {
                return false;
            } else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        nQueen(0);

        System.out.println(cnt);


    }
}
