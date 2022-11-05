package algorithm_221105;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ1755_숫자놀이_221105 {

    private static int N, M;
    private static ArrayList<Word> arrayList;

    private static String arr[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    private static class Word implements Comparable<Word> {

        String word;
        int num;

        public Word(String word, int num) {
            this.word = word;
            this.num = num;
        }

        @Override
        public int compareTo(Word o) {
            return this.word.compareTo(o.word);
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        arrayList = new ArrayList<>();

        for (int i = M; i <= N; i++) {
            String numString = Integer.toString(i);
            char ch[] = numString.toCharArray();
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < numString.length(); j++) {
                sb.append(arr[ch[j] - '0']);
                if (ch.length > 1) {
                    sb.append(" ");
                }
            }

            arrayList.add(new Word(sb.toString(), i));
        }

        Collections.sort(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i).num + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}
