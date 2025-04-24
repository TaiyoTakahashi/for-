package chatGPT_1_70問;
public class Q063_BreakExample3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; ; i++) { // 無限ループ
            sum += i;
            if (sum > 100) {
                System.out.println("合計が100を超えた時点: i = " + i + ", 合計 = " + sum);
                break;
            }
        }
    }
}
