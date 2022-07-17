package algorithm_220717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ13414_수강신청_220717 {

    private static int K, L;
    private static LinkedHashSet<String> numSet;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        K = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        numSet = new LinkedHashSet<>();

        for (int i = 0; i < L; i++) {
            String num = br.readLine();

            if (numSet.contains(num)) {
                numSet.remove(num);
            }
            numSet.add(num);
        }

        StringBuilder sb = new StringBuilder();

        Iterator it = numSet.iterator();

        int cnt = 0;
        while (it.hasNext()) {
            if (cnt == K) break;
            sb.append(it.next()).append("\n");
            cnt++;
        }

        System.out.println(sb);
    }
}
