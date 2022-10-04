package algorithm_221004;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ4659_비밀번호발음하기_221004 {

    private static boolean check(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (type(str.charAt(i)) == 1)
                break;
            if (i == str.length() - 1)
                return false;
        }

        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            int type = type(str.charAt(i));
            if (type > 0 && cnt > 0)
                cnt++;
            else if (type < 0 && cnt < 0)
                cnt--;
            else
                cnt = type;
            if (Math.abs(cnt) == 3)
                return false;
        }

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == str.charAt(i) && str.charAt(i) != 'e' && str.charAt(i) != 'o')
                return false;
        }

        return true;
    }

    private static int type(char c) {
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return 1;
            default:
                return -1;
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = "";
        StringBuilder sb = new StringBuilder();

        while (!(input = br.readLine()).equals("end")) {
            sb.append(String.format(check(input) ? "<%s> is acceptable.\n" : "<%s> is not acceptable.\n", input));
        }

        System.out.println(sb);
    }
}
