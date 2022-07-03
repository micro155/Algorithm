package algorithm_220703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ3190_뱀_220703 {

    private static int N, K, L;
    private static int board[][];
    private static int dx[] = {0, 1, 0, -1};
    private static int dy[] = {1, 0, -1, 0};
    private static ChangeDirect directs[];
    private static int curX, curY, curDirect, curTime;
    private static boolean isEnd;
    private static Queue<Snake> snake;


    private static class Snake {
        int x;
        int y;

        public Snake(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static class ChangeDirect {
        int time;
        String direct;

        public ChangeDirect(int time, String direct) {
            this.time = time;
            this.direct = direct;
        }
    }


    private static void move(int x, int y, int time, int direct) {

        for (int i = 0; i < directs.length; i++) {
            if (time == directs[i].time) {
                if (directs[i].direct.equals("L")) {
                    int nextDirect = direct - 1;
                    if (nextDirect < 0) nextDirect = 3;
                    direct = nextDirect;
                } else {
                    int nextDirect = direct + 1;
                    if (nextDirect > 3) nextDirect = 0;
                    direct = nextDirect;
                }
            }
        }

        int nx = x + dx[direct];
        int ny = y + dy[direct];

        if (nx < 0 || ny < 0 || nx >= N || ny >= N) {
            isEnd = true;
            curTime = time + 1;
            return;
        }

        if (board[nx][ny] == 2) {
            board[nx][ny] = 1;
            snake.offer(new Snake(nx, ny));
        } else if (board[nx][ny] == 1) {
            isEnd = true;
            curTime = time + 1;
            return;
        } else {
            board[nx][ny] = 1;
            snake.offer(new Snake(nx, ny));
            Snake tail = snake.poll();
            board[tail.x][tail.y] = 0;
        }

        move(nx, ny, time + 1, direct);
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());

        board = new int[N][N];
        snake = new LinkedList<>();


        for (int i = 0; i < K; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            board[Integer.parseInt(st.nextToken()) - 1][Integer.parseInt(st.nextToken()) - 1] = 2;
        }

        L = Integer.parseInt(br.readLine());
        directs = new ChangeDirect[L];

        for (int i = 0; i < L; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            directs[i] = new ChangeDirect(Integer.parseInt(st.nextToken()), st.nextToken());
        }

        isEnd = false;
        snake.offer(new Snake(0, 0));

        curX = 0;
        curY = 0;
        curTime = 0;
        curDirect = 0;
        board[0][0] = 1;

        while (!isEnd) {
            move(curX, curY, curTime, curDirect);
        }

        System.out.println(curTime);


    }
}
