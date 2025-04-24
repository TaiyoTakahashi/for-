package chatGPT_1_60問;
public class Q060_DiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];  // 対角線要素
        }

        System.out.println("対角線の合計: " + sum);
    }
}
