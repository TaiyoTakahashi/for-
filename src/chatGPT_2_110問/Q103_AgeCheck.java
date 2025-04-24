package chatGPT_2_110問;
import java.util.Scanner;

public class Q103_AgeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("年齢を入力: ");
        int age = scanner.nextInt();
        if (age >= 20) {
            System.out.println("成人です");
        } else {
            System.out.println("未成年です");
        }
    }
}
