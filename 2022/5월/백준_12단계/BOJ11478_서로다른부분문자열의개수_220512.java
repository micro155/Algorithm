package algorithm_220512;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BOJ11478_서로다른부분문자열의개수_220512 {

    private static String input;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        input = br.readLine();

        Set<String> list = new HashSet<>();

        for (int i = 0; i <= input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                if (!list.contains(input.substring(i, j))) {
                    list.add(input.substring(i, j));
                }
            }
        }

        System.out.println(list.size());


    }
}
