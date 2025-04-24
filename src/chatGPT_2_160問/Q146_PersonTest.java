package chatGPT_2_160問;
import java.util.Scanner;

class Person {
    String name;
    int age;

    public Person(String string) {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public Person() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	void show() {
        System.out.println("名前: " + name + ", 年齢: " + age);
    }
}

public class Q146_PersonTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person p = new Person();
        System.out.print("名前を入力: ");
        p.name = scanner.nextLine();
        System.out.print("年齢を入力: ");
        p.age = scanner.nextInt();
        p.show();
    }
}
