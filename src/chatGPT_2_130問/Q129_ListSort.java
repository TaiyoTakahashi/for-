package chatGPT_2_130問;
import java.util.ArrayList;
import java.util.Collections;

public class Q129_ListSort {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(15);
        nums.add(5);
        nums.add(20);

        Collections.sort(nums);

        for (int n : nums) {
            System.out.println(n);
        }
    }
}
