package algorithm_220109;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ14891_톱니바퀴_220109 {

    private static int wheel[][];
    private static int change_wheel[][];
    private static int K;
    private static int answer;

    private static class Pair {
        private int index;
        private int direction;

        public Pair(int index, int direction) {
            this.index = index;
            this.direction = direction;
        }

    }

    private static void cycle(Pair p) {

            if (p.index == 1) {
                if (wheel[0][2] != wheel[1][6]) {

                    if (wheel[2][6] != wheel[1][2] && wheel[2][2] != wheel[3][6]) {
                        changeWheel(0, p.direction);
                        changeWheel(1, p.direction * -1);
                        changeWheel(2, p.direction);
                        changeWheel(3, p.direction * -1);
                    } else if (wheel[2][6] != wheel[1][2] && wheel[2][2] == wheel[3][6]) {
                        changeWheel(0, p.direction);
                        changeWheel(1, p.direction * -1);
                        changeWheel(2, p.direction);
                    } else {
                        changeWheel(0, p.direction);
                        changeWheel(1, p.direction * -1);
                    }
                } else {
                    changeWheel(0, p.direction);
                }
            } else if (p.index == 4) {
                if (wheel[3][6] != wheel[2][2]) {

                    if (wheel[1][2] != wheel[2][6] && wheel[1][6] != wheel[0][2]) {
                        changeWheel(3, p.direction);
                        changeWheel(2, p.direction * -1);
                        changeWheel(1, p.direction);
                        changeWheel(0, p.direction * -1);
                    } else if (wheel[1][2] != wheel[2][6] && wheel[1][6] == wheel[0][2]) {
                        changeWheel(3, p.direction);
                        changeWheel(2, p.direction * -1);
                        changeWheel(1, p.direction);
                    } else {
                        changeWheel(3, p.direction);
                        changeWheel(2, p.direction * -1);
                    }
                } else {
                    changeWheel(3, p.direction);
                }
            } else if (p.index == 2) {
                if (wheel[1][6] != wheel[0][2] && wheel[1][2] != wheel[2][6]) {
                    if (wheel[3][6] != wheel[2][2]) {
                        changeWheel(1, p.direction);
                        changeWheel(0, p.direction * -1);
                        changeWheel(2, p.direction * -1);
                        changeWheel(3, p.direction);
                    } else {
                        changeWheel(1, p.direction);
                        changeWheel(0, p.direction * -1);
                        changeWheel(2, p.direction * -1);
                    }
                } else if (wheel[1][6] != wheel[0][2] && wheel[1][2] == wheel[2][6]) {
                    changeWheel(1, p.direction);
                    changeWheel(0, p.direction * -1);
                } else if (wheel[1][2] != wheel[2][6] && wheel[1][6] == wheel[0][2]) {
                    if (wheel[3][6] != wheel[2][2]) {
                        changeWheel(1, p.direction);
                        changeWheel(2, p.direction * -1);
                        changeWheel(3, p.direction);
                    } else {
                        changeWheel(1, p.direction);
                        changeWheel(2, p.direction * -1);
                    }
                } else {
                    changeWheel(1, p.direction);
                }
            } else {
                if (wheel[2][6] != wheel[1][2] && wheel[2][2] != wheel[3][6]) {
                    if (wheel[1][6] != wheel[0][2]) {
                        changeWheel(2, p.direction);
                        changeWheel(1, p.direction * -1);
                        changeWheel(3, p.direction * -1);
                        changeWheel(0, p.direction);
                    } else {
                        changeWheel(2, p.direction);
                        changeWheel(1, p.direction * -1);
                        changeWheel(3, p.direction * -1);
                    }
                } else if (wheel[2][6] != wheel[1][2] && wheel[2][2] == wheel[3][6]) {
                    if (wheel[1][6] != wheel[0][2]) {
                        changeWheel(2, p.direction);
                        changeWheel(1, p.direction * -1);
                        changeWheel(0, p.direction);
                    } else {
                        changeWheel(2, p.direction);
                        changeWheel(1, p.direction * -1);
                    }
                } else if (wheel[2][2] != wheel[3][6] && wheel[2][6] == wheel[1][2]) {
                    changeWheel(2, p.direction);
                    changeWheel(3, p.direction * -1);
                } else {
                    changeWheel(2, p.direction);
                }
            }


    }

    private static void changeWheel(int index, int direction) {

        if (direction == 1) {
            change_wheel[index][0] = wheel[index][7];
            for (int i = 1; i < 8; i++) {
                change_wheel[index][i] = wheel[index][i - 1];
            }
        } else {
            change_wheel[index][7] = wheel[index][0];
            for (int i = 6; i >= 0; i--) {
                change_wheel[index][i] = wheel[index][i + 1];
            }
        }

        for (int i = 0; i < 8; i++) {
            wheel[index][i] = change_wheel[index][i];
        }

    }

    private static void result() {

        for (int i = 0; i < 4; i++) {
            if (wheel[i][0] == 1) {
                if (i == 0) {
                    answer += 1;
                } else if (i == 1) {
                    answer += 2;
                } else if (i == 2) {
                    answer += 4;
                } else {
                    answer += 8;
                }
            }
        }


    }



    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        wheel = new int[4][8];
        change_wheel = new int[4][8];
        answer = 0;

        for (int i = 0; i < 4; i++) {
            String str = br.readLine();
            for (int j = 0; j < 8; j++) {
                wheel[i][j] = Integer.parseInt(String.valueOf(str.charAt(j)));
                change_wheel[i][j] = wheel[i][j];
            }
        }

        K = Integer.parseInt(br.readLine());

        for (int i = 0; i < K; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int index = Integer.parseInt(st.nextToken());
            int direction = Integer.parseInt(st.nextToken());

            cycle(new Pair(index, direction));
        }

        result();

        System.out.println(answer);

    }
}
