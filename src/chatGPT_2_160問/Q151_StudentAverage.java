package chatGPT_2_160問;
import java.util.ArrayList;


public class Q151_StudentAverage {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("田中", 80));
        students.add(new Student("佐藤", 90));
        students.add(new Student("鈴木", 70));

        int total = 0;
        for (Student s : students) {
            total += s.score;
        }

        double avg = total / (double) students.size();
        System.out.println("平均点: " + avg);
    }
}
