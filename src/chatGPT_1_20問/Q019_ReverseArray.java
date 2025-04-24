package chatGPT_1_20問;
public class Q019_ReverseArray {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        for (int i = data.length - 1; i >= 0; i--) {
            System.out.print(data[i] + " ");
        }
    }
}
