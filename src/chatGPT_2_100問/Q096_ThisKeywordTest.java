package chatGPT_2_100問;
class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;  // クラスのフィールドとローカル変数を区別
        this.y = y;
    }

    void show() {
        System.out.println("(" + x + "," + y + ")");
    }
}

public class Q096_ThisKeywordTest {
    public static void main(String[] args) {
        Point p = new Point(3, 7);
        p.show();
    }
}
