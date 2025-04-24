package chatGPT_1_60問;
public class Q052_LuckySeven {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 7 == 0 || String.valueOf(i).contains("7")) {
                System.out.print(i + " ");
            }
        }
    }
}
