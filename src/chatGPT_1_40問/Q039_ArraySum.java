package chatGPT_1_40問;
public class Q039_ArraySum {
    public static void main(String[] args) {
        int[] data = {5, 10, 15, 20};
        int sum = 0;
        for (int num : data) {
            sum += num;
        }
        System.out.println("合計: " + sum);
    }
}
