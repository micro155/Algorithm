package algorithm_220629;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ1075_나누기_220629 {


    private static int F;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String numInput = br.readLine();
        F = Integer.parseInt(br.readLine());

        String part = "" + numInput.charAt(numInput.length() - 2) + numInput.charAt(numInput.length() - 1);

        int num = Integer.parseInt(numInput) - Integer.parseInt(part);

        int rest = num % F;

        if (rest == 0) {
            System.out.println("00");
        } else {
            int result = F - rest;

            if (String.valueOf(result).length() >= 3) {
                System.out.println("00");
            } else {
                if (result < 10) {
                    System.out.println("0" + result);
                } else {
                    System.out.println(result);
                }
            }
        }


    }
}
