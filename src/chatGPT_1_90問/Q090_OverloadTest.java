package chatGPT_1_90問;
class Printer {
    void print(String message) {
        System.out.println("メッセージ: " + message);
    }

    void print(int number) {
        System.out.println("数値: " + number);
    }
}

public class Q090_OverloadTest {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print("こんにちは");
        p.print(100);
    }
}
