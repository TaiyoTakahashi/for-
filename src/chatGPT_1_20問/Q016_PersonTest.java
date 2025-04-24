package chatGPT_1_20問;
class Person {
    String name;
    int age;

    void introduce() {
        System.out.println("名前: " + name + ", 年齢: " + age);
    }
}

public class Q016_PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "田中";
        p.age = 25;
        p.introduce();
    }
}
