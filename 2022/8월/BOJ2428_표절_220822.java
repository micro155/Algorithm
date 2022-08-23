package algorithm_220822;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ2428_표절_220822 {

    private static int N, arr[];

    private static int binarySearch(int arr[], int start) {

        int left = start;
        int right = arr.length - 1;
        int mid;
        int re = start;

        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[start] * 10 >= arr[mid] * 9) {
                re = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return re;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        long sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        for (int i = 0; i < N; i++) {
            sum += binarySearch(arr, i) - i;
        }

        System.out.println(sum);


    }
}
