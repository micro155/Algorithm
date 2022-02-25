package algorithm_220225;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2941_크로아티아알파벳_220225 {

    private static String str;
    private static boolean check[];
    private static String words[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        str = br.readLine();
        check = new boolean[str.length()];
        int result = 0;

        for (int i = 0; i < words.length; i++) {

            String temps = str;

            int reset_index = 0;
            while (true) {
                int start = temps.indexOf(words[i]);
                int words_length = words[i].length();
                if (start != -1) {
                    if (check[reset_index + start] == false) {
                        for (int j = 0; j < words_length; j++) {
                            check[reset_index + start++] = true;
                        }
                        result++;
                        temps = temps.substring(start);
                        reset_index += start;
                    } else {
                        reset_index += start + words_length;
                        temps = temps.substring(start + words_length);
                        continue;
                    }
                } else {
                    break;
                }
            }
        }

        for (int i = 0; i < check.length; i++) {
            if (check[i] == false) {
                result++;
            }
        }

        System.out.println(result);
    }
}
