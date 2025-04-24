package chatGPT_1_90問;
class Person {
    private String name;
    private int age;

    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }
    int getAge() {
        return age;
    }
    void setAge(int age) {
        this.age = age;
    }
}

public class Q084_PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("高橋");
        p.setAge(22);
        System.out.println(p.getName() + "さんは" + p.getAge() + "歳です。");
    }
}
