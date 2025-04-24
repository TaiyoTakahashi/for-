package chatGPT_2_110問;
import java.util.Scanner;

public class Q105_RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("繰り返す回数を入力: ");
        int count = scanner.nextInt();
        scanner.nextLine();  // バッファクリア
        System.out.print("文字列を入力: ");
        String word = scanner.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.println(word);
        }
    }
}
