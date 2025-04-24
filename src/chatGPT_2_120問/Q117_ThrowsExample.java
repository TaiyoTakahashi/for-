package chatGPT_2_120問;
public class Q117_ThrowsExample {
    public static void checkNumber(int n) throws Exception {
        if (n < 0) throw new Exception("負の数は許可されていません");
    }

    public static void main(String[] args) {
        try {
            checkNumber(-5);
        } catch (Exception e) {
            System.out.println("例外処理: " + e.getMessage());
        }
    }
}
