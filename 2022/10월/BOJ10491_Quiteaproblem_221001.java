package algorithm_221001;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ10491_Quiteaproblem_221001 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "";
        String regex = "(?i).*problem.*";

        while ((str = br.readLine()) != null) {
            if (str.matches(regex)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
