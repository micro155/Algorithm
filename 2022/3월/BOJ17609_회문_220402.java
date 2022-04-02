package algorithm_220402;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ17609_회문_220402 {


    private static int N;

    private static int isPalin(int start, int end, boolean isDelete, String str) {

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {

                if (!isDelete) {
                    if (isPalin(start + 1, end, true, str) == 0 || isPalin(start, end - 1, true, str) == 0) {
                        return 1;
                    }
                    return 2;
                } else {
                    return 2;
                }
            } else {
                start++;
                end--;
            }
        }
        return 0;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            System.out.println(isPalin(0, str.length() - 1, false, str));
        }
    }
}
