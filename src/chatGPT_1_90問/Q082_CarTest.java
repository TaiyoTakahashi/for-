package chatGPT_1_90問;
class Car {
    String model;
    int year;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println(year + "年式の" + model);
    }
}

public class Q082_CarTest {
    public static void main(String[] args) {
        Car car = new Car("プリウス", 2020);
        car.display();
    }
}
