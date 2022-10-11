package algorithm_221011;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BOJ2870_수학숙제_221011 {

    private static int N;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        ArrayList<BigDecimal> arrayList = new ArrayList<>();
        String regex = "([\\d]+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            matcher = pattern.matcher(input);
            while (matcher.find()) {
                arrayList.add(new BigDecimal(matcher.group()));
            }
        }

        arrayList.sort(null);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
