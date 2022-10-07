package algorithm_221008;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ10173_니모를찾아서_221008 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = "";
        String regex = "(?i).*nemo.*";
        StringBuilder sb = new StringBuilder();

        while (!(input = br.readLine()).equals("EOI")) {
            if (input.matches(regex)) {
                sb.append("Found").append("\n");
            } else {
                sb.append("Missing").append("\n");
            }
        }

        System.out.println(sb);
    }
}
