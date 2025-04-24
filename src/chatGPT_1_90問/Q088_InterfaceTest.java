package chatGPT_1_90問;
interface Movable {
    void move();
}

class Robot implements Movable {
    public void move() {
        System.out.println("ロボットが動きます");
    }
}

public class Q088_InterfaceTest {
    public static void main(String[] args) {
        Movable m = new Robot();
        m.move();
    }
}
