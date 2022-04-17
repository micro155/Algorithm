package algorithm_220416;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ9020_골드바흐의추측_220416 {

    private static int T;
    private static boolean arr[];

    private static void makePrime() {

        arr[0] = true;
        arr[1] = true;

        for (int i = 2; i <= Math.sqrt(arr.length); i++) {
            if (arr[i])
                continue;
            for (int j = i * i; j < arr.length; j += i) {
                arr[j] = true;
            }
        }

    }


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());
        arr = new boolean[10001];

        makePrime();

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int num = Integer.parseInt(st.nextToken());

            int a = num / 2;
            int b = num / 2;

            while (true) {
                if (!arr[a] && !arr[b]) {
                    System.out.println(a + " " + b);
                    break;
                } else {
                    a--;
                    b++;
                }
            }
        }
    }
}
