package algorithm_220624;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ11721_열개씩끊어출력하기_220624 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        ArrayList<String> arrayList = new ArrayList<>();

        int len = input.length();
        int cur_len = 0;


        int cur = 0;

        do {

            if (len - cur_len < 10) {
                cur_len += len - cur_len;
            } else {
                cur_len += 10;
            }

            String str = "";
            for (int i = cur; i < cur_len; i++) {
                str += input.charAt(i);
            }

            arrayList.add(str);

            cur = cur_len;
        } while (cur_len < len);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
