package algorithm_220331;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1357_뒤집힌덧셈_220331 {

    private static String N, M;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = st.nextToken();
        StringBuffer sb = new StringBuffer(N);
        result += Integer.parseInt(sb.reverse().toString());
        M = st.nextToken();
        sb = new StringBuffer(M);
        result += Integer.parseInt(sb.reverse().toString());
        String result_str = String.valueOf(result);
        sb = new StringBuffer(result_str);

        System.out.println(Integer.parseInt(sb.reverse().toString()));

    }
}
