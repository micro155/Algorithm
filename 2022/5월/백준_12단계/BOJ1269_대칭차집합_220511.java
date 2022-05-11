package algorithm_220511;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ1269_대칭차집합_220511 {

    private static int A, B;
    private static Set<Integer> set;
    private static Set<Integer> set2;
    private static ArrayList<Integer> arrayList;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        set = new HashSet<>();
        set2 = new HashSet<>();
        arrayList = new ArrayList<>();
        int sum = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A; i++) {
            int num = Integer.parseInt(st.nextToken());
            set.add(num);
            arrayList.add(num);
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < B; i++) {
            int num = Integer.parseInt(st.nextToken());
            set2.add(num);
            if (!set.contains(num)) {
                sum++;
            }
        }

        for (int i = 0; i < arrayList.size(); i++) {
            if (!set2.contains(arrayList.get(i))) {
                sum++;
            }
        }

        System.out.println(sum);


    }
}
