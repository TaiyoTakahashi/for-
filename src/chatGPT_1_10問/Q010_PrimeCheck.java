package chatGPT_1_10問;
import java.util.Scanner;

public class Q010_PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("整数を入力: ");
        int n = scanner.nextInt();
        boolean isPrime = true;

        if (n <= 1) isPrime = false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println(n + " は素数です");
        else
            System.out.println(n + " は素数ではありません");
    }
}
