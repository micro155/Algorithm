package algorithm_220619;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ1417_국회의원선거_220619 {

    private static int N;

    private static int count(int first, int arr[], int count) {

        Arrays.sort(arr);

        int last = arr.length - 1;

        if (first > arr[last]) {
            return count;
        }
        arr[last]--;

        return count(first + 1, arr,count + 1);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        int arr[] = new int[N - 1];
        int first = Integer.parseInt(br.readLine());

        for (int i = 0; i < N - 1; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        if (N == 1) {
            System.out.println(0);
        } else {
            System.out.println(count(first, arr, 0));
        }

    }
}
