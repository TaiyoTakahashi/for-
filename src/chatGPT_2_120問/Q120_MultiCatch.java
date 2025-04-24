package chatGPT_2_120問;
public class Q120_MultiCatch {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length()); // NullPointerException
            int[] arr = new int[2];
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
        } catch (NullPointerException e) {
            System.out.println("ヌルポです");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("配列の範囲外です");
        }
    }
}
