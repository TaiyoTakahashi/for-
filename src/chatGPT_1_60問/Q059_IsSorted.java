package chatGPT_1_60問;
public class Q059_IsSorted {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        boolean sorted = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                sorted = false;
                break;
            }
        }

        if (sorted) {
            System.out.println("昇順です");
        } else {
            System.out.println("昇順ではありません");
        }
    }
}
