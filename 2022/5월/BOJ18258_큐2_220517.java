package algorithm_220517;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ18258_큐2_220517 {

    private static int N;
    private static LinkedList<Integer> q;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String oper = st.nextToken();

            if (st.hasMoreTokens()) {
                int num = Integer.parseInt(st.nextToken());
                q.offer(num);
            } else {
                if (oper.equals("front")) {
                    if (!q.isEmpty()) {
                        sb.append(q.peek()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                } else if (oper.equals("back")) {
                    if (!q.isEmpty()) {
                        sb.append(q.peekLast()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                } else if (oper.equals("size")) {
                    sb.append(q.size()).append("\n");
                } else if (oper.equals("empty")) {
                    if (q.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                } else {
                    if (q.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        int num = q.poll();
                        sb.append(num).append("\n");
                    }
                }
            }
        }

        System.out.println(sb);
    }
}
