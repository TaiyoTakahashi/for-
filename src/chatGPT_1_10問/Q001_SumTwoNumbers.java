package chatGPT_1_10問;
import java.util.Scanner;

public class Q001_SumTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1つ目の整数: ");
        int a = scanner.nextInt();
        System.out.print("2つ目の整数: ");
        int b = scanner.nextInt();
        System.out.println("合計: " + (a + b));
    }
}
//int,Scanner,print