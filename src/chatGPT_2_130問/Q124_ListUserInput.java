package chatGPT_2_130問;
import java.util.ArrayList;
import java.util.Scanner;

public class Q124_ListUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        System.out.println("文字列を5つ入力してください：");
        for (int i = 0; i < 5; i++) {
            words.add(scanner.nextLine());
        }

        for (String word : words) {
            System.out.println(word);
        }
    }
}
