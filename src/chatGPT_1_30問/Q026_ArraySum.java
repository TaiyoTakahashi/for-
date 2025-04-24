package chatGPT_1_30問;
public class Q026_ArraySum {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.println("合計: " + sum);
    }
}
