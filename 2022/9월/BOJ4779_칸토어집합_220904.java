package algorithm_220904;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ4779_칸토어집합_220904 {

    private static char result[];

    private static void recursive(int start, int len) {

        if (len < 3) {
            return;
        }

        for (int i = start + len / 3; i < start + len / 3 * 2; i++)
            result[i] = ' ';

        recursive(start, len / 3);
        recursive(start + len / 3 * 2, len / 3);
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = "";

        while ((input = br.readLine()) != null) {

            int num = Integer.parseInt(input);

            int newNum = (int) Math.pow(3, num);

            result = new char[newNum];

            for (int i = 0; i < newNum; i++) {
                result[i] = '-';
            }

            recursive(0, newNum);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < newNum; i++) {
                sb.append(result[i]);
            }

            System.out.println(sb);
        }

    }
}
