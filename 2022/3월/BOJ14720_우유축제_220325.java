package algorithm_220325;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14720_우유축제_220325 {

    private static int N;
    private static int arr[];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int current = -1;
        int result = 0;

        for (int i = 0; i < N; i++) {
            if (arr[i] == 0) {
                if (current == -1 || current == 2) {
                    current = 0;
                    result++;
                }
            } else if (arr[i] == 1) {
                if (current == 0) {
                    current = 1;
                    result++;
                }
            } else if (arr[i] == 2) {
                if (current == 1) {
                    current = 2;
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}
