package chatGPT_1_60問;
public class Q056_PerfectNumber {
    public static void main(String[] args) {
        int n = 28;
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        if (sum == n) {
            System.out.println(n + " は完全数です");
        } else {
            System.out.println(n + " は完全数ではありません");
        }
    }
}
