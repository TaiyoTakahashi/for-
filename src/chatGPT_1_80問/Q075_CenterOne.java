package chatGPT_1_80問;
public class Q075_CenterOne {
    public static void main(String[] args) {
        int[][] grid = new int[5][5];
        grid[2][2] = 1; // 中央を1に

        for (int[] row : grid) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
