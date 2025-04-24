package chatGPT_1_80問;
public class Q078_MaxValuePosition {
    public static void main(String[] args) {
        int[][] matrix = {
            {3, 7, 2},
            {5, 9, 1},
            {6, 4, 8}
        };

        int max = matrix[0][0];
        int rowIndex = 0, colIndex = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    rowIndex = i;
                    colIndex = j;
                }
            }
        }

        System.out.println("最大値: " + max + " (位置: [" + rowIndex + "][" + colIndex + "])");
    }
}
