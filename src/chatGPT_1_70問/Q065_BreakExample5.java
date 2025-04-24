package chatGPT_1_70問;
public class Q065_BreakExample5 {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        int target = 20;
        boolean found = false;

        for (int num : arr) {
            if (num == target) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "見つかりました！" : "見つかりませんでした");
    }
}
