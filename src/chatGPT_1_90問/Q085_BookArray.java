package chatGPT_1_90問;
class Book {
    String title;

    Book(String title) {
        this.title = title;
    }

    void show() {
        System.out.println("タイトル: " + title);
    }
}

public class Q085_BookArray {
    public static void main(String[] args) {
        Book[] books = {
            new Book("Java入門"),
            new Book("オブジェクト指向の基礎"),
            new Book("アルゴリズム図鑑")
        };

        for (Book b : books) {
            b.show();
        }
    }
}
