package algorithm_220227;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ1063_킹_220227 {

    private static int N;
    private static int arr[][];
    private static int dx[] = {-1, 1, 0, 0, -1, -1, 1, 1};
    private static int dy[] = {0, 0, -1, 1, -1, 1, -1, 1};
    private static Queue<String> q;


    private static void moveKing(int x, int y) {

        int cx = x;
        int cy = y;

        while (!q.isEmpty()) {

            String move = q.poll();

            int index = location(move);

            int nx = cx + dx[index];
            int ny = cy + dy[index];

            if (nx < 0 || nx >= 8 || ny < 0 || ny >= 8) {
                continue;
            }

            if (arr[nx][ny] == 1) {
                int sx = nx + dx[index];
                int sy = ny + dy[index];

                if (sx < 0 || sx >= 8 || sy < 0 || sy >= 8) {
                    continue;
                }

                arr[sx][sy] = 1;
            }
            arr[cx][cy] = 0;
            arr[nx][ny] = 2;
            cx = nx;
            cy = ny;


        }

    }

    private static int location(String str) {

        switch (str) {
            case "T":
                return 0;
            case "B":
                return 1;
            case "L":
                return 2;
            case "R":
                return 3;
            case "LT":
                return 4;
            case "RT":
                return 5;
            case "LB":
                return 6;
            case "RB":
                return 7;
            default:
                return -1;
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String king = st.nextToken();
        String stone = st.nextToken();
        N = Integer.parseInt(st.nextToken());
        arr = new int[8][8];
        q = new LinkedList<>();

        arr[(7 - (king.charAt(1) - '1'))][(king.charAt(0) - 'A')] = 2;
        arr[(7 - (stone.charAt(1) - '1'))][(stone.charAt(0) - 'A')] = 1;

        for (int i = 0; i < N; i++) {
            q.add(br.readLine());
        }

        moveKing((7 - (king.charAt(1) - '1')), king.charAt(0) - 'A');

        int king_x = 0;
        int king_y = 0;

        int stone_x = 0;
        int stone_y = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (arr[i][j] == 2) {
                    king_x = i;
                    king_y = j;
                } else if (arr[i][j] == 1) {
                    stone_x = i;
                    stone_y = j;
                } else {
                    continue;
                }
            }
        }

        System.out.print(((char) (king_y + 'A')) + "" + ((7 - king_x) + 1));
        System.out.println();
        System.out.print(((char) (stone_y + 'A')) + "" + ((7 - stone_x) + 1));
        System.out.println();


    }
}
