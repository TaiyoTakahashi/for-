package chatGPT_2_100問;
class Animal {
    void sound() {
        System.out.println("動物の音");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("ワンワン");
    }
}

class Bird extends Animal {
    void sound() {
        System.out.println("チュンチュン");
    }
}

public class Q095_PolymorphismTest {
    public static void main(String[] args) {
        Animal[] zoo = { new Dog(), new Bird(), new Animal() };
        for (Animal a : zoo) {
            a.sound();  // オーバーライドされたメソッドが呼ばれる
        }
    }
}
