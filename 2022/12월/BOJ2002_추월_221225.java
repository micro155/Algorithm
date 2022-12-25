package algorithm_221225;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BOJ2002_추월_221225 {

    private static int N;
    private static String input[], output[];
    private static boolean check[];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        input = new String[N];
        output = new String[N];
        check = new boolean[N];

        for (int i = 0; i < N; i++) {
            input[i] = br.readLine();
        }

        for (int i = 0; i < N; i++) {
            output[i] = br.readLine();
        }

        int result = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!input[i].equals(output[j])) {
                    if (!check[j]) {
                        check[j] = true;
                        result++;
                    }
                } else {
                    check[j] = true;
                    break;
                }
            }
        }

        System.out.println(result);
    }
}
