package algorithm_221031;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ23253_자료구조는정말최고야_221031 {

    private static int N, M;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        boolean result = true;

        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(br.readLine());
            String nums[] = br.readLine().split(" ");
            int preNum = 200_001;
            for (int j = 0; j < num; j++) {
                if (Integer.parseInt(nums[j]) > preNum) {
                    result = false;
                }
                preNum = Integer.parseInt(nums[j]);
            }
        }

        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
