package chatGPT_2_160問;
import java.util.ArrayList;


public class Q156_MaxScore {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("田中", 85));
        students.add(new Student("佐藤", 92));
        students.add(new Student("鈴木", 78));

        Student max = students.get(0);
        for (Student s : students) {
            if (s.score > max.score) {
                max = s;
            }
        }

        System.out.println("最高得点: " + max.name + "（" + max.score + "点）");
    }
}
