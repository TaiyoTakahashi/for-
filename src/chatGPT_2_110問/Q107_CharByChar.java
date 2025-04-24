package chatGPT_2_110問;
import java.util.Scanner;

public class Q107_CharByChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("文字列を入力: ");
        String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
    }
}
