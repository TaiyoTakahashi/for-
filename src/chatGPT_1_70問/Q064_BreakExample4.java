package chatGPT_1_70問;
public class Q064_BreakExample4 {
    public static void main(String[] args) {
        outer:
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int result = i * j;
                if (result > 50) {
                    break outer; // 外側のループごと抜ける
                }
                System.out.println(i + " × " + j + " = " + result);
            }
        }
    }
}
