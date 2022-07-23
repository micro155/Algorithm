package algorithm_220723;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1969_DNA_220723 {

    private static int N, M;
    private static String arr[];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new String[N];

        int result = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int cnt[] = new int[4];
            for (int j = 0; j < N; j++) {

                char c = arr[j].charAt(i);

                switch (c) {
                    case 'A':
                        cnt[0]++;
                        break;
                    case 'C':
                        cnt[1]++;
                        break;
                    case 'G':
                        cnt[2]++;
                        break;
                    case 'T':
                        cnt[3]++;
                        break;
                }
            }

            int index = 0;
            int max = 0;

            for (int k = 0; k < 4; k++) {
                if (cnt[k] > max || (cnt[k] == max && k < index)) {
                    max = cnt[k];
                    index = k;
                }
            }

            switch (index) {
                case 0:
                    sb.append('A');
                    break;
                case 1:
                    sb.append('C');
                    break;
                case 2:
                    sb.append('G');
                    break;
                case 3:
                    sb.append('T');
                    break;
            }

            result += N - max;
        }

        System.out.println(sb);
        System.out.println(result);
    }
}
