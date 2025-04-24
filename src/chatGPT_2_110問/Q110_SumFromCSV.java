package chatGPT_2_110問;
import java.util.Scanner;

public class Q110_SumFromCSV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("カンマ区切りの数値を入力: ");
        String input = scanner.nextLine();

        String[] parts = input.split(",");
        int sum = 0;

        for (String part : parts) {
            sum += Integer.parseInt(part.trim());
        }

        System.out.println("合計: " + sum);
    }
}
