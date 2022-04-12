package algorithm_220410;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ10809_알파벳찾기_220410 {

    private static String input;
    private static int arr[];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        input = br.readLine();
        arr = new int[26];


        Arrays.fill(arr, -1);

        for (int i = 0; i < 26; i++) {

            int index = 'a' + i;

            for (int j = 0; j < input.length(); j++) {

                if (index == ((int) input.charAt(j))) {
                    if (arr[i] == -1) {
                        arr[i] = j;
                    }
                    break;
                }

            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
