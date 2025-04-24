package chatGPT_2_100問;
class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }

    void work() {
        System.out.println(name + " は働いています");
    }
}

class Manager extends Employee {
    Manager(String name) {
        super(name);
    }

    void manage() {
        System.out.println(name + " はマネジメントしています");
    }
}

public class Q094_InheritanceEx {
    public static void main(String[] args) {
        Manager m = new Manager("佐藤");
        m.work();
        m.manage();
    }
}
