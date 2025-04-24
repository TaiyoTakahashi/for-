package chatGPT_1_50問;
public class Q045_EvenSumPairs {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.println(i + " + " + j + " = " + (i + j));
                }
            }
        }
    }
}
