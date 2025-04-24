package chatGPT_2_100問;
class Student {
    String name;
    int score;

    Student() {
        this.name = "未登録";
        this.score = 0;
    }

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    void show() {
        System.out.println(name + "さんの点数は " + score);
    }
}

public class Q092_OverloadConstructorTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("田中", 85);
        s1.show();
        s2.show();
    }
}
