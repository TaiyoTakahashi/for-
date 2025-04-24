package chatGPT_2_110問;
import java.util.Scanner;

public class Q106_AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("5つの整数を入力してください：");

        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            sum += num;
        }

        double average = sum / 5.0;
        System.out.println("平均: " + average);
    }
}
