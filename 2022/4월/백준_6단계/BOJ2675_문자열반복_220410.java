package algorithm_220410;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2675_문자열반복_220410 {

    private static int N;
    private static String arr[];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new String[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int num = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            String result_str = "";

            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < num; k++) {
                    result_str += str.charAt(j);
                }
            }
            arr[i] = result_str;
        }

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
    }
}
