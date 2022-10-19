package algorithm_221019;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ11557_YangjojangofTheYear_221019 {

    private static int T;

    private static class School implements Comparable<School> {
        String name;
        int amount;

        public School(String name, int amount) {
            this.name = name;
            this.amount = amount;
        }

        @Override
        public int compareTo(School o) {
            return this.amount - o.amount;
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < T; tc++) {
            int n = Integer.parseInt(br.readLine());
            School[] schools = new School[n];
            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                int num = Integer.parseInt(st.nextToken());
                schools[i] = new School(name, num);
            }

            Arrays.sort(schools);

            sb.append(schools[schools.length - 1].name).append('\n');
        }

        System.out.println(sb);
    }
}
