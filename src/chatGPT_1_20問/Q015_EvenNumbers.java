package chatGPT_1_20問;
public class Q015_EvenNumbers {
    public static void main(String[] args) {
        int[] numbers = {11, 22, 33, 44, 55, 66};
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}
