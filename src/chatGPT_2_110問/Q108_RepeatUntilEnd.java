package chatGPT_2_110問;
import java.util.Scanner;

public class Q108_RepeatUntilEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("文字列を入力（終了で停止）: ");
            String input = scanner.nextLine();
            if (input.equals("終了")) {
                break;
            }
            System.out.println("→ " + input);
        }
    }
}
