package chatGPT_1_90問;
abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("四角形を描画します");
    }
}

public class Q087_AbstractTest {
    public static void main(String[] args) {
        Shape s = new Rectangle();
        s.draw();
    }
}
