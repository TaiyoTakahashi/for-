package chatGPT_1_70問;
public class Q067_ContinueExample2 {
    public static void main(String[] args) {
        int[] numbers = {10, 0, 20, 0, 30};
        int sum = 0;

        for (int num : numbers) {
            if (num == 0) continue;
            sum += num;
        }

        System.out.println("0を除いた合計: " + sum);
    }
}
