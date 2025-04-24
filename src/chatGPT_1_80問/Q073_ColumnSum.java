package chatGPT_1_80問;
public class Q073_ColumnSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int col = 0; col < 3; col++) {
            int sum = 0;
            for (int row = 0; row < 3; row++) {
                sum += matrix[row][col];
            }
            System.out.println("列 " + col + " の合計: " + sum);
        }
    }
}
