package algorithm_221029;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ13417_카드문자열_221029 {

    private static int T;
    private static String str;

    private static void changeStr(char card) {
        if (card <= str.charAt(0))
            str = card + str;
        else
            str += card;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < T; tc++) {

            int num = Integer.parseInt(br.readLine());
            String card = br.readLine().replaceAll(" ", "");
            str = card.substring(0, 1);
            for (int i = 1; i < num; i++) {
                changeStr(card.charAt(i));
            }
            System.out.println(str);
        }

    }
}
