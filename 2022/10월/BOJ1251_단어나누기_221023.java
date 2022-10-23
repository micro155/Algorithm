package algorithm_221023;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ1251_단어나누기_221023 {


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String str[] = new String[3];
        ArrayList<String> str_list = new ArrayList<>();

        for (int i = 1; i < input.length() - 1; i++) {
            for (int j = i + 1; j < input.length(); j++) {
                str[0] = input.substring(0, i);
                str[1] = input.substring(i, j);
                str[2] = input.substring(j, input.length());

                StringBuilder sb = new StringBuilder();

                for (int k = 0; k < 3; k++) {
                    for (int l = str[k].length() - 1; l >= 0; l--) {
                        sb.append(str[k].charAt(l));
                    }
                }

                str_list.add(sb.toString());
                sb.setLength(0);
            }
        }

        Collections.sort(str_list);

        System.out.println(str_list.get(0));
    }
}
