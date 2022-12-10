package algorithm_221209;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BOJ3613_javavscpp_221209 {

    private static String input;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        input = br.readLine();
        String regex = "(?:_([a-z]))";
        String regex2 = "([A-Z])";

        if (input.matches(".*[A-Z].*") && input.matches(".*_.*") || input.matches(".*(_){2,}.*|^([A-Z]|_).*|.*(_)$") || input.equals("")) {
            System.out.println("Error!");
            return;
        } else {
            Matcher matcher;
            if (input.contains("_")) {
                matcher = Pattern.compile(regex).matcher(input);
                while (matcher.find()) {
                    input = input.replace(matcher.group(), matcher.group(1).toUpperCase());
                }
            } else {
                matcher = Pattern.compile(regex2).matcher(input);
                while (matcher.find()) {
                    input = input.replace(matcher.group(), "_" + matcher.group().toLowerCase());
                }
            }
        }

        System.out.println(input);
    }
}
