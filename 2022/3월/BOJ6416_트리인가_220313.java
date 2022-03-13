package algorithm_220313;

import java.util.*;

public class BOJ6416_트리인가_220313 {

    public static void main(String[] args) throws Exception {

        Set<Integer> num_set;
        int cnt[];
        int tc = 0;
        int root;
        int v;
        boolean twoIncomes;

        Scanner sc = new Scanner(System.in);

        while (true) {

            num_set = new HashSet<>();
            cnt = new int[1001];
            tc++;
            root = 0;
            twoIncomes = false;
            v = 0;

            while (true) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                if (a == 0 && b == 0) {
                    break;
                }
                if (a == -1 && b == -1) {
                    return;
                }

                num_set.add(a);
                num_set.add(b);
                cnt[b]++;
                v++;
            }

            if (num_set.size() == 0) {
                System.out.println("Case " + tc + " is a tree.");
                continue;
            }

            Iterator iter = num_set.iterator();
            while (iter.hasNext()) {
                int num = (int) iter.next();
                if (cnt[num] == 0)
                    root++;
                if (cnt[num] > 1) {
                    twoIncomes = true;
                    break;
                }
            }

            if (twoIncomes || root != 1 || num_set.size() - v != 1) {
                System.out.println("Case " + tc + " is not a tree.");
            } else {
                System.out.println("Case " + tc + " is a tree.");
            }
        }
    }
}
