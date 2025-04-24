package chatGPT_1_60問;
public class Q051_SortThree {
    public static void main(String[] args) {
        int a = 15, b = 7, c = 20;
        
        // スワップロジック（バブル風）
        if (a > b) { int tmp = a; a = b; b = tmp; }
        if (b > c) { int tmp = b; b = c; c = tmp; }
        if (a > b) { int tmp = a; a = b; b = tmp; }

        System.out.println(a + ", " + b + ", " + c);
    }
}
