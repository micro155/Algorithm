package algorithm_221230;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ2910_빈도정렬_221230 {

    private static int N, C;
    private static ArrayList<NumInfo> arrayList;
    private static HashMap<Integer, NumInfo> hashMap;

    private static class NumInfo implements Comparable<NumInfo> {
        int num; // 숫자
        int idx; // 입력 순서
        int cnt; // 숫자 등장 개수

        public NumInfo(int num, int idx, int cnt) {
            this.num = num;
            this.idx = idx;
            this.cnt = cnt;
        }

        // 숫자 등장 개수를 증가하는 함수
        public void increase() {
            this.cnt++;
        }

        @Override
        public int compareTo(NumInfo o) {
            // 등장 개수가 같은 숫자이면
            if (this.cnt == o.cnt)
                // 먼저 입력된 순으로 정렬
                return this.idx - o.idx;

            // 아니면 개수가 많이 나온 순서대로 내림차순 정렬
            return o.cnt - this.cnt;
        }
    }


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        arrayList = new ArrayList<>();
        hashMap = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());

            // 아직 등장한 숫자가 없으면
            if (!hashMap.containsKey(num)) {
                NumInfo numInfo = new NumInfo(num, i, 0);
                // Map에 숫자 정보 입력
                hashMap.put(num, numInfo);
                // List에도 숫자 정보 입력
                arrayList.add(numInfo);
            }
            // 해당 숫자의 개수 증가
            hashMap.get(num).increase();
        }

        // List 정렬
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arrayList.size(); i++) {
            NumInfo numInfo = arrayList.get(i);
            int num = numInfo.num;
            int cnt = numInfo.cnt;

            for (int j = 0; j < cnt; j++) {
                sb.append(num).append(" ");
            }
        }

        System.out.println(sb);
    }
}
