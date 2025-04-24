package chatGPT_2_160問;
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int score;

    public Student() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

    public Student(String string) {
		// TODO 自動生成されたコンストラクター・スタブ
	}
    public Student(String string, int i) {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	
	

	void show() {
        System.out.println(name + ": " + score + "点");
    }
}

public class Q148_StudentList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Student s = new Student();
            System.out.print("名前: ");
            s.name = sc.nextLine();
            System.out.print("点数: ");
            s.score = Integer.parseInt(sc.nextLine());
            list.add(s);
        }

        System.out.println("--- 結果 ---");
        for (Student s : list) {
            s.show();
        }
    }
}
