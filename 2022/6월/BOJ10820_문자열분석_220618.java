package algorithm_220618;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BOJ10820_문자열분석_220618 {


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = "";

        while ((input = br.readLine()) != null) {
            int arr[] = new int[4];

            if (input.isEmpty()) {
                break;
            }

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);

                if (c >= 'a' && c <= 'z') {
                    arr[0]++;
                }
                if (c >= 'A' && c <= 'Z') {
                    arr[1]++;
                }
                if (c >= '0' && c <= '9') {
                    arr[2]++;
                }
                if (c == ' ') {
                    arr[3]++;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(arr[0]).append(" ").append(arr[1]).append(" ").append(arr[2]).append(" ").append(arr[3]);
            System.out.println(sb);
        }
    }
}
