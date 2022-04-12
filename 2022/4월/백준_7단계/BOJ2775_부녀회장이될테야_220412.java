package algorithm_220412;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2775_부녀회장이될테야_220412 {

    private static int T;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {

            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            int arr[][] = new int[k][n];

            for (int j = 0; j < n; j++) {
                arr[0][j] = j + 1;
            }
            

        }
    }
}
