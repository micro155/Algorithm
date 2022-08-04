package algorithm_220804;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ19941_햄버거분배_220804 {

    private static int N, K;
    private static char arr[];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        arr = new char[N];
        int result = 0;

        String input = br.readLine();
        for (int i = 0; i < N; i++) {
            arr[i] = input.charAt(i);
        }

        for (int i = 0; i < N; i++) {
            if (arr[i] != 'P')
                continue;
            for (int j = i - K; j <= i + K; j++) {
                if (0 <= j && j < N && arr[j] == 'H') {
                    arr[j] = '0';
                    result++;
                    break;
                }
            }
        }

        System.out.println(result);
    }
}
