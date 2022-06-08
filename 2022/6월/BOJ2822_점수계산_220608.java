package algorithm_220608;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class BOJ2822_점수계산_220608 {

    private static Pair arr[];
    private static ArrayList<Integer> indexArray;

    private static class Pair implements Comparable<Pair> {
        int index;
        int num;

        public Pair(int index, int num) {
            this.index = index;
            this.num = num;
        }

        @Override
        public int compareTo(Pair o) {
            return o.num - this.num;
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr = new Pair[8];
        indexArray = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            arr[i] = new Pair(i + 1, Integer.parseInt(br.readLine()));
        }

        Arrays.sort(arr);
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            sum += arr[i].num;
            indexArray.add(arr[i].index);
        }

        indexArray.sort(null);

        System.out.println(sum);
        for (int i = 0; i < indexArray.size(); i++) {
            System.out.print(indexArray.get(i) + " ");
        }
        System.out.println();

    }
}
