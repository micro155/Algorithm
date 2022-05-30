package algorithm_220530;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1051_숫자정사각형_220530 {

    private static int N, M;
    private static int arr[][];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        int min = Math.min(N, M);
        int area = 0;
        int maxArea = 0;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < min; k++) {

                    if (i + k < N && j + k < M) {
                        if (arr[i][j] == arr[i][j + k] && arr[i][j] == arr[i + k][j] && arr[i][j] == arr[i + k][j + k]) {
                            area = (int) Math.pow(k + 1, 2);
                            maxArea = Math.max(maxArea, area);
                        }
                    }

                }
            }
        }

        System.out.println(maxArea);
    }
}
