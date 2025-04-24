package chatGPT_2_100問;
class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

public class Q091_CircleTest {
    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        System.out.println("面積: " + c.area());
    }
}
