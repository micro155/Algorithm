package algorithm_220920;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ13424_비밀모임_220920 {

    private static int T;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int dist[][] = new int[N + 1][N + 1];

            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    if (i == j)
                        dist[i][j] = 0;
                    else
                        dist[i][j] = 10000000;
                }
            }

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int cost = Integer.parseInt(st.nextToken());

                dist[a][b] = cost;
                dist[b][a] = cost;
            }

            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    for (int k = 1; k <= N; k++) {
                        dist[j][k] = Math.min(dist[j][k], dist[j][i] + dist[i][k]);
                    }
                }
            }

            int K = Integer.parseInt(br.readLine());
            int person[] = new int[K];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < K; i++) {
                person[i] = Integer.parseInt(st.nextToken());
            }


            int index = -1;
            int min = 10000000;

            for (int i = 1; i <= N; i++) {
                int sum = 0;
                for (int j = 0; j < person.length; j++) {
                    sum += dist[person[j]][i];
                }

                if (min > sum) {
                    index = i;
                    min = sum;
                }
            }

            System.out.println(index);
        }
    }
}
