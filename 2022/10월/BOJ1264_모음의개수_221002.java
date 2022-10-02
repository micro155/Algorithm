package algorithm_221002;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BOJ1264_모음의개수_221002 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = "";
        String regex = "(?i)[aeiou]";
        Pattern pattern = Pattern.compile(regex);

        while (!(input = br.readLine()).equals("#")) {
            int count = 0;
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                count++;
            }
            System.out.println(count);
        }
    }
}
