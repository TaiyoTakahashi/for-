package chatGPT_1_10問;
import java.util.Scanner;

public class Q009_GreetName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("あなたの名前は？: ");
        String name = scanner.nextLine();
        System.out.println("こんにちは、" + name + "さん！");
    }
}
