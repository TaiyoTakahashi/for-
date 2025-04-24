package chatGPT_1_50問;
public class Q048_MatrixEvenSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int sum = 0;

        for (int[] row : matrix) {
            for (int val : row) {
                if (val % 2 == 0) {
                    sum += val;
                }
            }
        }

        System.out.println("偶数の合計: " + sum);
    }
}
