package algorithm_221027;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ2210_숫자판점프_221027 {

    private static int arr[][] = new int[5][5];
    private static int dx[] = {1, 0, -1, 0};
    private static int dy[] = {0, -1, 0, 1};
    private static HashSet<String> hashSet;
    private static int result;

    private static void dfs(int x, int y, ArrayList<Integer> arr_list, int cnt) {
        if (cnt == 5) {
            String str = "";
            for (int i = 0; i < arr_list.size(); i++) {
                str += arr_list.get(i);
            }

            if (!hashSet.contains(str)) {
                result++;
                hashSet.add(str);
            }
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || nx > 4 || ny < 0 || ny > 4)
                continue;

            arr_list.add(arr[nx][ny]);
            dfs(nx, ny, arr_list, cnt + 1);
            arr_list.remove(arr_list.size() - 1);
        }
    }


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        hashSet = new HashSet<>();
        result = 0;

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                ArrayList<Integer> str_list = new ArrayList<>();
                str_list.add(arr[i][j]);
                dfs(i, j, str_list, 0);
            }
        }

        System.out.println(result);
    }
}
