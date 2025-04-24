package chatGPT_2_120問;
public class Q114_ParseIntError {
    public static void main(String[] args) {
        String input = "abc";  // 整数に変換できない
        try {
            int num = Integer.parseInt(input);
            System.out.println("変換結果: " + num);
        } catch (NumberFormatException e) {
            System.out.println("整数に変換できません: " + input);
        }
    }
}
