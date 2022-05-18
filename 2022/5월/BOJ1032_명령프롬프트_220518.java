package algorithm_220518;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ1032_명령프롬프트_220518 {


    private static int N;
    private static ArrayList<String> arrayList;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arrayList = new ArrayList<>();
        int length = 0;
        String result = "";

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            if (i == 0) {
                length = input.length();
            }
            arrayList.add(input);
        }

        for (int i = 0; i < length; i++) {

            boolean check = true;
            char pre = '0';
            for (int j = 0; j < N; j++) {
                if (j == 0) {
                    pre = arrayList.get(j).charAt(i);
                } else {
                    if (pre != arrayList.get(j).charAt(i)) {
                        check = false;
                        break;
                    }
                }
            }

            if (check) {
                result += pre;
            } else {
                result += '?';
            }
        }

        System.out.println(result);


    }
}
