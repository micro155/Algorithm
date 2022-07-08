package algorithm_220708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ6236_용돈관리_220708 {

    private static int N, M, arr[];


    private static boolean calc(int mid) {


        int num = 1;
        int sum = mid;

        for (int i = 0; i < N; i++) {

            if (mid < arr[i]) {
                return false;
            }

            if (sum - arr[i] < 0) {
                sum = mid;
                num++;
            }
            sum -= arr[i];
        }

        return M >= num;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];

        int sum = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        int min = 1;
        int max = sum;
        int result = 0;

        while (min <= max) {

            int mid = (min + max) / 2;

            if (calc(mid)) {
                result = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }

        System.out.println(result);
        br.close();
    }
}
