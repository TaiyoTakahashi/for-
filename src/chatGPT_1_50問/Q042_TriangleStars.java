package chatGPT_1_50問;
public class Q042_TriangleStars {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("★");
            }
            System.out.println();
        }
    }
}
