package algorithm_220830;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ9009_피보나치_220830 {

    private static int N, arr[];

    private static ArrayList<Long> calFivo(long num) {
        ArrayList<Long> fivo = new ArrayList<>();
        ArrayList<Long> result = new ArrayList<>();
        fivo.add(0L);
        fivo.add(1L);
        int index = 2;

        while (true) {
            long sum = fivo.get(index - 1) + fivo.get(index - 2);
            if (sum > num) break;
            fivo.add(sum);
            index++;
        }

        Collections.sort(fivo, Collections.reverseOrder());

        while (num != 0) {
            for (int i = 0; i < fivo.size(); i++) {
                if (fivo.get(i) <= num) {
                    num -= fivo.get(i);
                    result.add(fivo.get(i));
                }
            }
        }

        Collections.sort(result);
        result.remove(0);
        return result;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            ArrayList<Long> resultList = calFivo(num);
            for (int j = 0; j < resultList.size(); j++) {
                sb.append(resultList.get(j)).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);


    }
}
