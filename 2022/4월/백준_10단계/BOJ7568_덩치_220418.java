package algorithm_220418;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ7568_덩치_220418 {

    private static int N;
    private static Person arr[];
    private static int result[];

    static class Person {

        int height;
        int weight;

        public Person(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }
    }

    private static int rank(int index) {

        int cnt = 1;
        for (int i = 0; i < N; i++) {
            if (i == index)
                continue;
            if (arr[index].height < arr[i].height && arr[index].weight < arr[i].weight) {
                cnt++;
            }
        }

        return cnt;

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new Person[N];
        result = new int[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            arr[i] = new Person(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < N; i++) {
            result[i] = rank(i);
        }

        for (int i = 0; i < N; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
