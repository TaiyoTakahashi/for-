package chatGPT_1_20問;
import java.util.Scanner;

public class Q011_RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("文字列: ");
        String str = scanner.nextLine();
        System.out.print("回数: ");
        int times = scanner.nextInt();

        for (int i = 0; i < times; i++) {
            System.out.print(str);
        }
    }
}
