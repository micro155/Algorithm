package algorithm_221114;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ3135_라디오_221114 {


    private static int A, B, N;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        N = Integer.parseInt(br.readLine());

        int min = Math.abs(A - B);
        
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            min = Math.min(min, Math.abs(B - num) + 1);
        }

        System.out.println(min);
    }
}
