package algorithm_220927;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ3447_버그왕_220927 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String source;
        StringBuilder sb = new StringBuilder();
        while ((source = br.readLine()) != null) {
            while (source.contains("BUG")) {
                source = source.replaceAll("BUG", "");
            }
            sb.append(source).append("\n");
        }
        System.out.println(sb);
    }
}
