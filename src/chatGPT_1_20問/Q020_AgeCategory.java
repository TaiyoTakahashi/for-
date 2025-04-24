package chatGPT_1_20問;
import java.util.Scanner;

public class Q020_AgeCategory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("年齢を入力: ");
        int age = scanner.nextInt();

        if (age < 20) {
            System.out.println("未成年です");
        } else if (age < 65) {
            System.out.println("成人です");
        } else {
            System.out.println("高齢者です");
        }
    }
}
