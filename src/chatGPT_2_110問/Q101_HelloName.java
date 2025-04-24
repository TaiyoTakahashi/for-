package chatGPT_2_110問;
import java.util.Scanner;

public class Q101_HelloName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("あなたの名前は？ ");
        String name = scanner.nextLine();
        System.out.println("こんにちは、" + name + "さん！");
    }
}
