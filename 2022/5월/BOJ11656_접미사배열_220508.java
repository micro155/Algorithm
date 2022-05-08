package algorithm_220508;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ11656_접미사배열_220508 {

    private static String input;
    private static ArrayList<String> arrayList;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        input = br.readLine();
        arrayList = new ArrayList<>();

        int start = 0;

        while (start <= input.length() - 1) {
            String str = "";
            for (int i = start; i < input.length(); i++) {
                str += String.valueOf(input.charAt(i));
            }
            arrayList.add(str);
            start++;
        }

        arrayList.sort(null);
        
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
