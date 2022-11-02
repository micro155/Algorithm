package algorithm_221102;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class BOJ7785_회사에있는사람_221102 {

    private static int N;
    private static HashSet<String> hashSet;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        hashSet = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String input[] = br.readLine().split(" ");

            if (input[1].equals("enter")) {
                hashSet.add(input[0]);
            } else {
                hashSet.remove(input[0]);
            }
        }

        Iterator iterator = hashSet.iterator();

        ArrayList<String> result_list = new ArrayList<>();

        while (iterator.hasNext()) {
            result_list.add(iterator.next().toString());
        }

        Collections.sort(result_list, Collections.reverseOrder());

        for (int i = 0; i < result_list.size(); i++) {
            System.out.println(result_list.get(i));
        }
    }
}
