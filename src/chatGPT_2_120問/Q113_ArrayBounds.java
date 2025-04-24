package chatGPT_2_120問;
public class Q113_ArrayBounds {
    public static void main(String[] args) {
        int[] data = {10, 20, 30};
        try {
            System.out.println(data[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("配列の範囲外です");
        }
    }
}
