package algorithm_220422;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ10814_나이순정렬_220422 {

    private static int N;

    static class Person implements Comparable<Person> {

        int age;
        String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }


        @Override
        public int compareTo(Person o) {

            return this.age - o.age;
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        Person[] p = new Person[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int num = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            p[i] = new Person(num, name);
        }

        Arrays.sort(p);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            sb.append(p[i].age).append(" ").append(p[i].name).append("\n");
        }

        System.out.println(sb);
    }
}
