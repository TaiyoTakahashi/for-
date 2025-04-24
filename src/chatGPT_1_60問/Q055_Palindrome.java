package chatGPT_1_60問;
public class Q055_Palindrome {
    public static void main(String[] args) {
        String str = "level";
        String reversed = new StringBuilder(str).reverse().toString();

        if (str.equals(reversed)) {
            System.out.println("回文です");
        } else {
            System.out.println("回文ではありません");
        }
    }
}
