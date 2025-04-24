package chatGPT_2_110問;
import java.util.Scanner;

public class Q102_CalcTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("整数を2つ入力（スペース区切り）: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("和: " + (a + b));
        System.out.println("差: " + (a - b));
        System.out.println("積: " + (a * b));
        if (b != 0) {
            System.out.println("商: " + (a / b));
        } else {
            System.out.println("0では割れません");
        }
    }
}
