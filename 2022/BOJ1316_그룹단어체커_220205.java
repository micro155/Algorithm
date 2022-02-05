package algorithm_220205;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ1316_그룹단어체커_220205 {

    private static int N;
    private static int result;

    private static boolean checkWord(String str) {


        boolean checkResult = false;
        for (int i = 0; i < str.length(); i++) {
            int sumCheck = 0;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    if (sumCheck == 2) {
                        sumCheck = 3;
                        break;
                    } else {
                        sumCheck = 1;
                    }

                } else {
                    sumCheck = 2;
                }
            }
            if (sumCheck != 3) {
                checkResult = true;
            } else {
                checkResult = false;
                break;
            }
        }

        return checkResult;

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        result = 0;

        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            boolean check = checkWord(temp);
            if (check) {
                result++;
            }
        }

        System.out.println(result);
    }
}
