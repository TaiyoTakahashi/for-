package chatGPT_1_90問;
class Dog {
    String name;
    int age;

    void introduce() {
        System.out.println("名前: " + name + ", 年齢: " + age + "歳");
    }
}

public class Q081_DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "ポチ";
        dog.age = 3;
        dog.introduce();
    }
}
