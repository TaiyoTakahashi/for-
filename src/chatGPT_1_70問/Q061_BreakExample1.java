package chatGPT_1_70問;
public class Q061_BreakExample1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println("最初の7の倍数: " + i);
                break;
            }
        }
    }
}
