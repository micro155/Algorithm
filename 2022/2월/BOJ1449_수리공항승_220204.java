package algorithm_220204;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ1449_수리공항승_220204 {

    private static int N;
    private static int L;
    private static ArrayList<Pair> range;

    private static class Pair implements Comparable<Pair> {
        private double start;
        private double end;

        public Pair(double start, double end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Pair o) {
            return (int) (this.start - o.start);
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st =  new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        range = new ArrayList<>();


        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            double num = Double.parseDouble(st.nextToken());
            range.add(new Pair(num - 0.5, num + 0.5));
        }

        range.sort(null);

        double max = range.get(0).start + L;
        int cnt = 1;

        for (int i = 1; i < N; i++) {
            if (max >= range.get(i).end) {
                continue;
            } else {
                max = range.get(i).start + L;
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
