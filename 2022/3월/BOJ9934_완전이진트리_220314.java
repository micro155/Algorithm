package algorithm_220314;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ9934_완전이진트리_220314 {

    private static int N;
    private static int arr[];
    private static StringBuilder sb[];


    private static void solve(int start, int end, int floor) {

        if (floor == N) {
            return;
        }

        int mid = (start + end) / 2;
        sb[floor].append(arr[mid] + " ");

        solve(start, mid - 1, floor + 1);
        solve(mid + 1, end, floor + 1);

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[(int) Math.pow(2, N) - 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        sb = new StringBuilder[N];

        for (int i = 0; i < N; i++) {
            sb[i] = new StringBuilder();
        }

        solve(0, arr.length - 1, 0);

        for (int i = 0; i < sb.length; i++) {
            System.out.println(sb[i]);
        }

    }
}
