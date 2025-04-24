package chatGPT_1_70問;
public class Q069_ContinueExample4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            if (i % 2 == 0) continue; // 偶数段をスキップ

            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " × " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
