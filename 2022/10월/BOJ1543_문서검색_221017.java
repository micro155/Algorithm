package algorithm_221017;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ1543_문서검색_221017 {


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String word = br.readLine();

        if (str.length() < word.length()) {
            System.out.println(0);
            return;
        }

        int cnt = 0;
        for (int i = 0; i <= str.length() - word.length(); i++) {
            if (str.charAt(i) == word.charAt(0)) {
                String sub = str.substring(i, i + word.length());
                if (sub.equals(word)) {
                    cnt++;
                    i += (word.length() - 1);
                }
            }
        }

        System.out.println(cnt);
    }
}
