package algorithm_220303;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ2435_기상청인턴신현수_220303 {

    private static int N, K;
    private static int arr[];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        arr = new int[100];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        ArrayList<Integer> num_arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = i; j < i + K; j++) {
                sum += arr[j];
            }
            num_arr.add(sum);
            if (i + K == N) {
                break;
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num_arr.size(); i++) {
            max = Math.max(max, num_arr.get(i));
        }

        System.out.println(max);
    }
}
