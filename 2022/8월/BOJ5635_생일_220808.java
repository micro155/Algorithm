package algorithm_220808;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ5635_생일_220808 {

    private static int N;
    private static Person arr[];

    private static class Person implements Comparable<Person> {
        String name;
        long birth;

        public Person(String name, long birth) {
            this.name = name;
            this.birth = birth;
        }

        @Override
        public int compareTo(Person o) {
            return (int) (this.birth - o.birth);
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new Person[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int day = Integer.parseInt(st.nextToken());
            String dayStr = "";
            if (day <= 9) {
                dayStr = "0" + day;
            } else {
                dayStr += day;
            }
            int month = Integer.parseInt(st.nextToken());
            String monthStr = "";
            if (month <= 9) {
                monthStr = "0" + month;
            } else {
                monthStr += month;
            }
            int year = Integer.parseInt(st.nextToken());
            String birthStr = "" + year + monthStr + dayStr;
            long birth = Long.parseLong(birthStr);
            arr[i] = new Person(name, birth);
        }

        Arrays.sort(arr);

        System.out.println(arr[N - 1].name);
        System.out.println(arr[0].name);
    }
}
