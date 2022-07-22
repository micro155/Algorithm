package algorithm_220722;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ4158_CD_220722 {

    private static int A[], B[];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            A = new int[N];
            B = new int[M];

            if (N == 0 && M == 0) {
                break;
            } else {

                int result = 0;

                for (int i = 0; i < N; i++) {
                    A[i] = Integer.parseInt(br.readLine());
                }

                for (int i = 0; i < M; i++) {
                    B[i] = Integer.parseInt(br.readLine());
                }

                int posA = 0;
                int posB = 0;

                while (true) {
                    if (posA == N || posB == M) {
                        break;
                    }

                    if (A[posA] < B[posB]) {
                        posA++;
                    } else if (A[posA] > B[posB]) {
                        posB++;
                    } else {
                        posA++;
                        posB++;
                        result++;
                    }
                }

                System.out.println(result);

            }
        }
    }
}
