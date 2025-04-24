package chatGPT_1_20問;
public class Q012_MinMaxArray {
    public static void main(String[] args) {
        int[] numbers = {45, 78, 23, 56, 12, 89};
        int max = numbers[0];
        int min = numbers[0];

        for (int num : numbers) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("最大値: " + max);
        System.out.println("最小値: " + min);
    }
}
