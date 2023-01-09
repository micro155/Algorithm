package algorithm_230109;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1652_누울자리를찾아라_230109 {

    private static int N;
    private static char arr[][];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new char[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            for (int j = 0; j < N; j++) {
                char c = input.charAt(j);
                arr[i][j] = c;
            }
        }

        int cnt = 0;
        int row = 0;
        int col = 0;

        for (int i = 0; i < N; i++) {
            cnt = 0;
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == '.')
                    cnt++;
                else if (arr[i][j] == 'X') {
                    if (cnt >= 2) {
                        row++;
                        cnt = 0;
                    } else {
                        cnt = 0;
                    }
                }
            }
            if (cnt >= 2)
                row++;
        }

        for (int i = 0; i < N; i++) {
            cnt = 0;
            for (int j = 0; j < N; j++) {
                if (arr[j][i] == '.')
                    cnt++;
                else if (arr[j][i] == 'X') {
                    if (cnt >= 2) {
                        col++;
                        cnt = 0;
                    } else {
                        cnt = 0;
                    }
                }
            }
            if (cnt >= 2)
                col++;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(row).append(" ").append(col);
        System.out.println(sb);
    }
}
