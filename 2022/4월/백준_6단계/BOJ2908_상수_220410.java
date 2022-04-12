package algorithm_220410;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2908_상수_220410 {


    private static String N, M;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = st.nextToken();
        M = st.nextToken();

        StringBuilder sb = new StringBuilder();
        sb.append(N);
        String temp = sb.reverse().toString();
        int num1 = Integer.parseInt(temp);
        sb = new StringBuilder();
        sb.append(M);
        temp = sb.reverse().toString();
        int num2 = Integer.parseInt(temp);
        
        int max = Math.max(num1, num2);

        System.out.println(max);
    }
}
