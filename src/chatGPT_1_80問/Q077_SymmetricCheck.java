package chatGPT_1_80問;
public class Q077_SymmetricCheck {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 1},
            {4, 5, 4},
            {1, 2, 1}
        };

        boolean isSymmetric = true;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length / 2; j++) {
                if (matrix[i][j] != matrix[i][matrix[i].length - 1 - j]) {
                    isSymmetric = false;
                    break;
                }
            }
        }

        System.out.println(isSymmetric ? "左右対称です" : "左右対称ではありません");
    }
}
