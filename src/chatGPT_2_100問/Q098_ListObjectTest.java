package chatGPT_2_100問;
import java.util.ArrayList;

class Person {
    String name;
    Person(String name) {
        this.name = name;
    }

    void greet() {
        System.out.println("こんにちは、" + name + "です");
    }
}

public class Q098_ListObjectTest {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("田中"));
        people.add(new Person("佐藤"));
        people.add(new Person("鈴木"));

        for (Person p : people) {
            p.greet();
        }
    }
}
