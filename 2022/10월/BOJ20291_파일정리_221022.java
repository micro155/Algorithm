package algorithm_221022;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class BOJ20291_파일정리_221022 {

    private static int N;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        HashMap map = new HashMap();
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String str[] = br.readLine().split("\\.");
            if (map.get(str[1]) != null) {
                int num = (int) map.get(str[1]);
                map.put(str[1], num + 1);
            } else {
                arrayList.add(str[1]);
                map.put(str[1], 1);
            }
        }

        arrayList.sort(null);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i) + " " + map.get(arrayList.get(i)));
        }
    }
}
