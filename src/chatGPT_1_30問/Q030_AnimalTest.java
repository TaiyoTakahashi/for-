package chatGPT_1_30問;
class Animal {
    String name;

    void speak() {
        System.out.println("動物の名前は: " + name);
    }
}

public class Q030_AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "ネコ";
        a.speak();
    }
}
