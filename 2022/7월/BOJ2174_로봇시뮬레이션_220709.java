package algorithm_220709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ2174_로봇시뮬레이션_220709 {

    private static int A, B, N, M;
    private static int arr[][];
    private static char directions[] = {'N', 'E', 'S', 'W'};
    private static ArrayList<Point> pointList;
    private static ArrayList<Operation> operList;

    private static class Point {
        int x;
        int y;
        char direct;

        public Point(int x, int y, char direct) {
            this.x = x;
            this.y = y;
            this.direct = direct;
        }
    }

    private static class Operation {
        int num;
        char oper;
        int count;

        public Operation(int num, char oper, int count) {
            this.num = num;
            this.oper = oper;
            this.count = count;
        }
    }

    private static int changeDirection(char direct, boolean isLeft) {
        int index = 0;
        for (int i = 0; i < 4; i++) {
            if (direct == directions[i]) {
                index = i;
            }
        }
        if (isLeft) {
            if (index - 1 < 0) {
                index = 3;
            } else {
                index--;
            }
        } else {
            if (index + 1 > 3) {
                index = 0;
            } else {
                index++;
            }
        }

        return index;
    }

    private static boolean runOper(int num_index) {

        char oper = operList.get(num_index).oper;
        int count = operList.get(num_index).count;
        int num = operList.get(num_index).num;


        while (count > 0) {

            int x = pointList.get(num - 1).x;
            int y = pointList.get(num - 1).y;
            char direct = pointList.get(num - 1).direct;

            if (oper == 'L') {
                int index = changeDirection(direct, true);
                pointList.set(num - 1, new Point(x, y, directions[index]));
            } else if (oper == 'R') {
                int index = changeDirection(direct, false);
                pointList.set(num - 1, new Point(x, y, directions[index]));
            } else {
                if (direct == 'N') {
                    if (x - 1 > 0) {
                        if (arr[x - 1][y] != 0) {
                            System.out.println("Robot " + num + " crashes into robot " + arr[x - 1][y]);
                            return false;
                        }
                        arr[x - 1][y] = num;
                        pointList.set(num - 1, new Point(x - 1, y, direct));
                        arr[x][y] = 0;
                    } else {
                        System.out.println("Robot " + num + " crashes into the wall");
                        return false;
                    }
                } else if (direct == 'E') {
                    if (y + 1 <= A) {
                        if (arr[x][y + 1] != 0) {
                            System.out.println("Robot " + num + " crashes into robot " + arr[x][y + 1]);
                            return false;
                        }
                        arr[x][y + 1] = num;
                        pointList.set(num - 1, new Point(x, y + 1, direct));
                        arr[x][y] = 0;
                    } else {
                        System.out.println("Robot " + num + " crashes into the wall");
                        return false;
                    }

                } else if (direct == 'S') {
                    if (x + 1 <= B) {
                        if (arr[x + 1][y] != 0) {
                            System.out.println("Robot " + num + " crashes into robot " + arr[x + 1][y]);
                            return false;
                        }
                        arr[x + 1][y] = num;
                        pointList.set(num - 1, new Point(x + 1, y, direct));
                        arr[x][y] = 0;
                    } else {
                        System.out.println("Robot " + num + " crashes into the wall");
                        return false;
                    }
                } else {
                    if (y - 1 > 0) {
                        if (arr[x][y - 1] != 0) {
                            System.out.println("Robot " + num + " crashes into robot " + arr[x][y - 1]);
                            return false;
                        }
                        arr[x][y - 1] = num;
                        pointList.set(num - 1, new Point(x, y - 1, direct));
                        arr[x][y] = 0;
                    } else {
                        System.out.println("Robot " + num + " crashes into the wall");
                        return false;
                    }
                }
            }
            count--;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        arr = new int[B + 1][A + 1];
        pointList = new ArrayList<>();
        operList = new ArrayList<>();

        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());


        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            char direct = st.nextToken().charAt(0);

            int rx = (B - x) + 1;
            arr[rx][y] = i + 1;
            pointList.add(new Point(rx, y, direct));
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            char oper = st.nextToken().charAt(0);
            int count = Integer.parseInt(st.nextToken());

            operList.add(new Operation(num, oper, count));
        }


        boolean resultCheck = false;
        for (int i = 0; i < operList.size(); i++) {
            boolean enable = runOper(i);
            if (!enable) {
                resultCheck = true;
                break;
            }
        }

        if (!resultCheck) {
            System.out.println("OK");
        }


    }
}
