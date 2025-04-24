package chatGPT_2_120問;
import java.util.Scanner;

public class Q111_DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("分子: ");
            int a = scanner.nextInt();
            System.out.print("分母: ");
            int b = scanner.nextInt();
            int result = a / b;
            System.out.println("結果: " + result);
        } catch (ArithmeticException e) {
            System.out.println("0では割れません");
        }
    }
}
