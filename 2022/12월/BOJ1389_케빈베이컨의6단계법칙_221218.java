package algorithm_221218;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ1389_케빈베이컨의6단계법칙_221218 {

    private static int N, M;
    private static boolean route[][];
    private static ArrayList<KevinPerson> resultList;

    // Node와 해당 Node의 케빈 베이컨 수를 위한 class
    private static class KevinPerson implements Comparable<KevinPerson> {
        int person; //
        int kevinNum; // 케빈 베이컨 수

        public KevinPerson(int person, int kevinNum) {
            this.person = person;
            this.kevinNum = kevinNum;
        }

        @Override
        public int compareTo(KevinPerson o) {
            return this.kevinNum - o.kevinNum;
        }
    }

    // BFS
    private static void BFS(int person) {
        Queue<KevinPerson> queue = new LinkedList<>();
        boolean visited[] = new boolean[N + 1];
        queue.add(new KevinPerson(person, 0));
        visited[person] = true;
        int result = 0;

        while (!queue.isEmpty()) {
            int start = queue.peek().person;
            int depth = queue.poll().kevinNum;

            for (int j = 1; j <= N; j++) {
                if (!visited[j] && route[start][j]) {
                    visited[j] = true;
                    result += (depth + 1);
                    queue.add(new KevinPerson(j, depth + 1));
                }
            }
        }

        resultList.add(new KevinPerson(person, result));
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        route = new boolean[N + 1][N + 1];

        resultList = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            // 양방향 그래프 특성에 따라 값 저장
            route[start][end] = true;
            route[end][start] = true;
        }

        for (int i = 1; i <= N; i++) {
            BFS(i);
        }

        // 케빈 베이컨 수를 기준으로 오름차순으로 정렬
        resultList.sort(null);

        int kevinMin = Integer.MAX_VALUE; // 케빈 베이컨 수 최소값
        int resultPerson = 0; // 최소값의 케빈 베이컨 수를 가진 person

        for (int i = 0; i < resultList.size(); i++) {
            if (kevinMin > resultList.get(i).kevinNum) {
                kevinMin = resultList.get(i).kevinNum;
                resultPerson = resultList.get(i).person;
            } else if (kevinMin == resultList.get(i).kevinNum) {
                if (resultPerson > resultList.get(i).person) {
                    resultPerson = resultList.get(i).person;
                }
            }
        }

        System.out.println(resultPerson);
    }
}
