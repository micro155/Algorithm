package algorithm_220725;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1100_하얀칸_220725 {


    private static boolean check[][] = {{false, true, false, true, false, true, false, true},
            {true, false, true, false, true, false, true, false},
            {false, true, false, true, false, true, false, true},
            {true, false, true, false, true, false, true, false},
            {false, true, false, true, false, true, false, true},
            {true, false, true, false, true, false, true, false},
            {false, true, false, true, false, true, false, true},
            {true, false, true, false, true, false, true, false}};

    private static char arr[][];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        arr = new char[8][8];

        for (int i = 0; i < 8; i++) {
            String input = br.readLine();
            for (int j = 0; j < 8; j++) {
                arr[i][j] = input.charAt(j);
            }
        }


        int sum = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (arr[i][j] == 'F' && check[i][j] == false) {
                    sum++;
                }
            }
        }

        System.out.println(sum);
    }
}
