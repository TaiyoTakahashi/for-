package chatGPT_1_70問;
public class Q062_BreakExample2 {
    public static void main(String[] args) {
        int[] data = {3, 7, -2, 8, -5};
        for (int num : data) {
            if (num < 0) {
                System.out.println("最初の負の値: " + num);
                break;
            }
        }
    }
}
