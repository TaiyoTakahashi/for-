package chatGPT_2_120問;
public class Q119_MockResource {
    public static void main(String[] args) {
        System.out.println("リソースをオープン");
        try {
            System.out.println("処理中...");
        } catch (Exception e) {
            System.out.println("エラーが発生");
        } finally {
            System.out.println("リソースをクローズ");
        }
    }
}
