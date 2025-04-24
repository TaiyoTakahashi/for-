package chatGPT_2_110問;
import java.util.Scanner;

public class Q109_MultiLineInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("何行入力しますか？: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // バッファクリア

        String[] lines = new String[n];
        System.out.println(n + "行入力してください：");

        for (int i = 0; i < n; i++) {
            lines[i] = scanner.nextLine();
        }

        System.out.println("入力内容:");
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
