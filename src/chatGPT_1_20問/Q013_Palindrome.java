package chatGPT_1_20問;
import java.util.Scanner;

public class Q013_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("文字列を入力: ");
        String input = scanner.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equals(reversed)) {
            System.out.println("回文です");
        } else {
            System.out.println("回文ではありません");
        }
    }
}
