package chatGPT_2_160問;
import java.util.Scanner;

class Book {
    String title;
    String author;

    void print() {
        System.out.println("『" + title + "』 by " + author);
    }
}

public class Q147_BookInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b = new Book();
        System.out.print("タイトル: ");
        b.title = sc.nextLine();
        System.out.print("著者: ");
        b.author = sc.nextLine();
        b.print();
    }
}
