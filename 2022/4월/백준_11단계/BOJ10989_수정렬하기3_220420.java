package algorithm_220420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ10989_수정렬하기3_220420 {

    private static int N;
    private static int arr[];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[10001];

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[num]++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 10001; i++) {
            for (int j = 0; j < arr[i]; j++) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);


    }
}
