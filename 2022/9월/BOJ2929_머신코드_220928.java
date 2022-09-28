package algorithm_220928;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BOJ2929_머신코드_220928 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String regex = "([A-Z][a-z]*)";

        Pattern pattern = Pattern.compile(regex);

        int cnt = 0;
        Matcher matcher = pattern.matcher(input);

        int start = 0;
        while (matcher.find()) {
            start = matcher.start();
            start += cnt;

            if (start % 4 != 0) {
                cnt += 4 - start % 4;
            }
        }

        System.out.println(cnt);
    }
}
