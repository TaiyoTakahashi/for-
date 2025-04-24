package chatGPT_2_130問;
import java.util.ArrayList;

public class Q122_ListSum {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);

        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        System.out.println("合計: " + sum);
    }
}
