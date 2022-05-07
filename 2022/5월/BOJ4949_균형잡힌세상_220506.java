package algorithm_220507;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class BOJ4949_균형잡힌세상_220506 {

    private static ArrayList<String> arrayList;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        arrayList = new ArrayList<>();

        while (true) {

            String input = br.readLine();

            if (input.equals(".")) {
                break;
            } else {

                Stack<Character> stack = new Stack<>();
                boolean isPerfect = true;
                for (int i = 0; i < input.length(); i++) {
                    char part = input.charAt(i);

                    if (part == '(' || part == '[') {
                        stack.push(part);
                    } else if (part == ')') {
                        if (stack.empty() || stack.peek() != '(') {
                            isPerfect = false;
                            break;
                        } else {
                            stack.pop();
                        }
                    } else if (part == ']') {
                        if (stack.empty() || stack.peek() != '[') {
                            isPerfect = false;
                            break;
                        } else {
                            stack.pop();
                        }
                    }

                }

                if (stack.empty() && isPerfect) {
                    arrayList.add("yes");
                } else {
                    arrayList.add("no");
                }

            }
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
