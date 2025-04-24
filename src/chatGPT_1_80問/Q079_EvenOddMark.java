package chatGPT_1_80問;
public class Q079_EvenOddMark {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print((num % 2 == 0 ? "○" : "×") + " ");
            }
            System.out.println();
        }
    }
}
