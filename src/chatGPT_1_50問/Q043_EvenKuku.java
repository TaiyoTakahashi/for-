package chatGPT_1_50問;
public class Q043_EvenKuku {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int result = i * j;
                if (result % 2 == 0) {
                    System.out.print(result + "\t");
                } else {
                    System.out.print("-\t");
                }
            }
            System.out.println();
        }
    }
}
