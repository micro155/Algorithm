package algorithm_230104;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ2304_창고다각형_230104 {

    private static int N, arr[];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        arr = new int[1001];
        int start = Integer.MAX_VALUE;
        int end = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int l = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());

            arr[l] = h;
            start = Math.min(start, l);
            end = Math.max(end, l);
        }

        Stack<Integer> height = new Stack<>();

        // 왼쪽 비교
        int temp = arr[start];
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] < temp) {
                height.push(i);
            } else {
                while (!height.isEmpty()) {
                    int x = height.pop();
                    arr[x] = temp;
                }
                temp = arr[i];
            }
        }

        height.clear();

        // 오른쪽 비교
        temp = arr[end];
        for (int i = end - 1; i >= start; i--) {
            if (arr[i] < temp) {
                height.push(i);
            } else {
                while (!height.isEmpty()) {
                    int x = height.pop();
                    arr[x] = temp;
                }
                temp = arr[i];
            }
        }

        int result = 0;
        for (int i = start; i <= end; i++) {
            result += arr[i];
        }

        System.out.print(result);
    }
}
