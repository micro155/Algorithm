package algorithm_220422;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ18870_좌표압축_220422 {

    private static int N;
    private static Set<Integer> set;
    private static ArrayList<Integer> arr_list;
    private static ArrayList<Integer> origin_list;

    private static int binarySearch(int target) {

        int start = 0;
        int end = arr_list.size() - 1;

        while (start < end) {

            int mid = (start + end) / 2;

            if (arr_list.get(mid) >= target) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return end;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        set = new HashSet<>();
        arr_list = new ArrayList<>();
        origin_list = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            origin_list.add(num);
            set.add(num);
        }

        Iterator<Integer> iter = set.iterator();

        while (iter.hasNext()) {
            int num = iter.next();
            arr_list.add(num);
        }

        Collections.sort(arr_list);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < origin_list.size(); i++) {
            int num = binarySearch(origin_list.get(i));
            sb.append(num).append(" ");
        }
        sb.append("\n");

        System.out.println(sb);


    }
}
