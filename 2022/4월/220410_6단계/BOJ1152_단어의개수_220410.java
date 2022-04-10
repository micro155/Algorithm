package algorithm_220410;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1152_단어의개수_220410 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = 0;

        while (st.hasMoreTokens()) {
            st.nextToken();
            result++;
        }

        System.out.println(result);
    }
}
