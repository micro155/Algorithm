package algorithm_220304;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ2776_암기왕_220304 {

    private static int T, N, M;
    private static int original[];
    private static int current;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringBuilder sb = new StringBuilder();
            N = Integer.parseInt(br.readLine());
            original = new int[N + 1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                original[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(original);

            M = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                current = Integer.parseInt(st.nextToken());
                int start = 0;
                int end = N;
                boolean result = false;

                while (start <= end) {
                    int mid = (start + end) / 2;

                    if (original[mid] == current) {
                        result = true;
                        break;
                    } else if (original[mid] > current) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
                sb.append(result ? 1 : 0).append("\n");
            }
            System.out.print(sb);
        }
    }
}
