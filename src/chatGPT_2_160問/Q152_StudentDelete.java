package chatGPT_2_160問;
import java.util.ArrayList;
import java.util.Scanner;



public class Q152_StudentDelete {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("田中"));
        list.add(new Student("佐藤"));
        list.add(new Student("鈴木"));

        Scanner sc = new Scanner(System.in);
        System.out.print("削除したい名前: ");
        String target = sc.nextLine();

        boolean removed = list.removeIf(s -> s.name.equals(target));

        if (removed) {
            System.out.println("削除しました");
        } else {
            System.out.println("見つかりませんでした");
        }
    }
}
