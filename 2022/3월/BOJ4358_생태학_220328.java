package algorithm_220328;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class BOJ4358_생태학_220328 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();

        int cnt = 0;

        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            map.put(str, map.getOrDefault(str, 0) + 1);
            cnt++;
            if (str == null || str.length() == 0) {
                break;
            }
        }

        Object[] keyArr = map.keySet().toArray();
        Arrays.sort(keyArr);

        StringBuilder sb = new StringBuilder();

        for (Object o : keyArr) {
            int value = map.get(o);
            double percent = ((double) value / (double) cnt) * 100;
            sb.append(o).append(" ").append(String.format("%.4f", percent)).append("\n");
        }
        System.out.println(sb);
    }
}
