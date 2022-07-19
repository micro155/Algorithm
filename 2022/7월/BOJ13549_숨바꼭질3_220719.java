package algorithm_220719;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ13549_숨바꼭질3_220719 {

    private static int N, K;
    private static boolean visited[];
    private static LinkedList<int[]> queue;


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        visited = new boolean[100001];
        queue = new LinkedList<>();

        queue.add(new int[]{N, 0});
        int x, time = 0;

        while (!queue.isEmpty()) {
            int temp[] = queue.poll();
            x = temp[0];
            time = temp[1];
            visited[x] = true;

            if (x == K)
                break;

            if (x * 2 <= 100000 && !visited[x * 2]) {
                queue.addFirst(new int[]{x * 2, time});
            }
            if (x < K && x < 100000 && !visited[x + 1]) {
                queue.add(new int[]{x + 1, time + 1});
            }
            if (x > 0 && !visited[x - 1]) {
                queue.add(new int[]{x - 1, time + 1});
            }
        }

        System.out.println(time);


    }
}
