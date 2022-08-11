package algorithm_220811;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ1373_2진수8진수_220811 {


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int len = input.length() % 3 == 0 ? input.length() / 3 : input.length() / 3 + 1;
        int arr[] = new int[len];

        //인덱스를 뒤에서 부터 세는 수작질
        int index = len - 1;
        for (int i = input.length() - 1; i >= 0; i--) {
            // '0'의 아스키코드 값 빼서 1또는 0 나오도록 만듦
            int chVal = input.charAt(i) - '0';

            if ((input.length() - i - 1) % 3 == 0) {
                arr[index] += chVal * 1;
            }
            if ((input.length() - i - 1) % 3 == 1) {
                arr[index] += chVal * 2;
            }
            if ((input.length() - i - 1) % 3 == 2) {
                arr[index--] += chVal * 4;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num);
        }

        System.out.println(sb);
    }
}
