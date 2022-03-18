package algorithm_220318;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1244_스위치켜고끄기_220318 {

    private static int N, M;
    private static boolean arr[];

    private static void male(int num) {

        int cnt = 1;
        while (num * cnt <= N) {

            arr[num * cnt] = !arr[num * cnt];

            cnt++;
        }

    }

    private static void female(int num) {

        int cnt = 1;

        arr[num] = !arr[num];
        while (num - cnt >= 1 && num + cnt <= N) {

            if (arr[num - cnt] == arr[num + cnt]) {
                arr[num - cnt] = !arr[num - cnt];
                arr[num + cnt] = !arr[num + cnt];
                cnt++;
            } else {
                break;
            }
        }

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new boolean[N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = (num == 1 ? true : false);
        }

        M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int person = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            if (person == 1) {
                male(num);
            } else {
                female(num);
            }
        }
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            if (arr[i] == true) {
                sb.append(1).append(" ");
                cnt++;
            } else {
                sb.append(0).append(" ");
                cnt++;
            }

            if (cnt == 20) {
                cnt = 0;
                sb.append("\n");
            }
        }

        System.out.println(sb);

    }
}
