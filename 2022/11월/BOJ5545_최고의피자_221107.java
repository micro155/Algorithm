package algorithm_221107;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ5545_최고의피자_221107 {

    private static int N, A, B, C;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        C = Integer.parseInt(br.readLine());

        Integer nums[] = new Integer[N];

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        int result = C / A;

        Arrays.sort(nums, Collections.reverseOrder());

        int tmpPrice = A;
        int tmpKcal = C;

        for (int i = 0; i < N; i++) {
            tmpPrice += B;
            tmpKcal += nums[i];
            int tmpAns = tmpKcal / tmpPrice;
            if (result > tmpAns) {
                break;
            } else {
                result = tmpAns;
            }
        }

        System.out.println(result);
    }
}
