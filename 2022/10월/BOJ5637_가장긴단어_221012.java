package algorithm_221012;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ5637_가장긴단어_221012 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = -1;
        String maxStr = null;

        while (true) {
            String input = br.readLine();
            String str[] = input.toLowerCase().split("[^a-z-]");

            for (String cur : str) {
                if (cur.equals("e-n-d")) {
                    System.out.println(maxStr.toLowerCase());
                    return;
                }
                if (max < cur.length()) {
                    max = cur.length();
                    maxStr = cur;
                }
            }
        }
    }
}
