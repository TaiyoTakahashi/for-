package chatGPT_1_10問;
import java.util.Scanner;

public class Q002_OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("整数を入力: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("偶数です");
        } else {
            System.out.println("奇数です");
        }
    }
}
