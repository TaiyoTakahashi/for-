package chatGPT_1_60問;
public class Q053_ConsecutiveCheck {
    public static void main(String[] args) {
        int[] data = {2, 4, 4, 7, 8};
        boolean found = false;

        for (int i = 1; i < data.length; i++) {
            if (data[i] == data[i - 1]) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("連続した同じ値があります");
        } else {
            System.out.println("連続した同じ値はありません");
        }
    }
}
