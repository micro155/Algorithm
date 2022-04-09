package algorithm_220408;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ4344_평균은넘겠지_220408 {

    private static int C;
    private static double arr[];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        C = Integer.parseInt(br.readLine());
        arr = new double[C];

        for (int i = 0; i < C; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int sum = 0;
            int students_num = Integer.parseInt(st.nextToken());
            int students[] = new int[students_num];

            for (int j = 0; j < students_num; j++) {
                int num = Integer.parseInt(st.nextToken());
                students[j] = num;
                sum += num;
            }

            int avg = sum / students_num;
            int better = 0;

            for (int j = 0; j < students.length; j++) {
                if (avg < students[j]) {
                    better++;
                }
            }

            double percent = Math.round(((double) better / students_num * 100) * 1000) / 1000.0;

            arr[i] = percent;
        }

        for (int i = 0; i < C; i++) {
            System.out.println(String.format("%.3f", arr[i]) + "%");
        }
    }
}
