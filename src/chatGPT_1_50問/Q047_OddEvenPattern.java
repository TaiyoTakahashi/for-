package chatGPT_1_50問;
public class Q047_OddEvenPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.print("○ ");
            } else {
                System.out.print("× ");
            }
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}
