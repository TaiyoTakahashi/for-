package chatGPT_2_120問;
import java.util.Scanner;

public class Q112_InputMismatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("年齢を入力: ");
            int age = scanner.nextInt();
            System.out.println("あなたの年齢: " + age);
        } catch (Exception e) {
            System.out.println("数値を入力してください");
        }
    }
}
