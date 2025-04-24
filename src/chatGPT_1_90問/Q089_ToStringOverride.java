package chatGPT_1_90問;
class Student {
    String name;
    int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student[name=" + name + ", id=" + id + "]";
    }
}

public class Q089_ToStringOverride {
    public static void main(String[] args) {
        Student s = new Student("佐藤", 12345);
        System.out.println(s);
    }
}
