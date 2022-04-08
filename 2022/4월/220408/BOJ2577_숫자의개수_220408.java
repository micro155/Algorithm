package algorithm_220408;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2577_숫자의개수_220408 {


    private static int A, B, C;
    private static int arr[];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());
        C = Integer.parseInt(br.readLine());

        arr = new int[10];

        String numStr = String.valueOf(A * B * C);

        for (int i = 0; i < numStr.length(); i++) {
            int index = Integer.parseInt(String.valueOf(numStr.charAt(i)));
            arr[index]++;
        }

        for (int i = 0; i <= 9; i++) {
            System.out.println(arr[i]);
        }
    }
}
