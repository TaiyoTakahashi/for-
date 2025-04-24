package chatGPT_2_120問;
public class Q116_ReThrowExample {
    public static void riskyMethod() throws Exception {
        throw new Exception("処理中にエラー発生");
    }

    public static void main(String[] args) {
        try {
            riskyMethod();
        } catch (Exception e) {
            System.out.println("エラーをキャッチしました: " + e.getMessage());
        }
    }
}
