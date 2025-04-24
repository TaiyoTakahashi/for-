package chatGPT_1_30問;
public class Q029_SumMethod {
    public static void main(String[] args) {
        System.out.println("1〜5の合計: " + sumTo(5));
    }

    public static int sumTo(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }
}
