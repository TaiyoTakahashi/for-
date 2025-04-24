package chatGPT_1_90問;
class Animal {
    void speak() {
        System.out.println("何かが鳴いている");
    }
}

class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("ニャー");
    }
}

public class Q086_InheritanceTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.speak();  // ニャー
    }
}
