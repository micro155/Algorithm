package algorithm_221003;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ14405_피카츄_221003 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        input = input.replaceAll("pi|ka|chu", "");

        if (input.equals("")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
