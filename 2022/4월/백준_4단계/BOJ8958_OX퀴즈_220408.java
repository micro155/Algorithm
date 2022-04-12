package algorithm_220408;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ8958_OX퀴즈_220408 {

    private static int N;
    private static int arr[];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        for (int i = 0; i < N; i++) {
            String answer = br.readLine();
            int result = 0;

            int add = 0;
            for (int j = 0; j < answer.length(); j++) {
                char isCorrect = answer.charAt(j);

                if (isCorrect == 'O') {
                    result += ++add;
                } else {
                    add = 0;
                }
            }
            arr[i] = result;
        }

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
    }
}
