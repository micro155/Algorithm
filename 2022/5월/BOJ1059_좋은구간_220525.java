package algorithm_220525;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1059_좋은구간_220525 {

    private static int L, N;
    private static int arr[];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        L = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        arr = new int[L];

        for (int i = 0; i < L; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        N = Integer.parseInt(br.readLine());

        int start = -1;
        int end = 10000;
        for (int number : arr) {
            if (number < N) {
                start = number;
            } else if (number > N) {
                if (end > number) {
                    end = number;
                }
            } else {
                System.out.println(0);
                return;
            }

            if (start != -1 && end != 10000) {
                break;
            }
        }

        if (start == -1) {
            start = 0;
        }
        if (end == -1) {
            end = 1001;
        }

        int answer = 0;
        for (int i = start + 1; i < end; i++) {
            if (i > N) {
                break;
            }

            for (int j = N; j < end; j++) {
                if (i == j) {
                    continue;
                }
                answer++;
            }
        }

        System.out.println(answer);
    }
}
