package algorithm_220122;

public class BOJ4673_셀프넘버_220122 {

    public static int self(int n) {
        int total = n;
        while(n != 0) {
            total += (n % 10);
            n /= 10;
        }
        return total;
    }

    public static void main(String[] args) {

        boolean check[] = new boolean[10001];

        for (int i = 1; i < 10001; i++) {
            int n = self(i);
            if (n < 10001) {
                check[n] = true;
            }
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 10001; i++) {
            if (!check[i]) {
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);


    }
}
